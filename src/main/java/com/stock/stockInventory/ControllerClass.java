package com.stock.stockInventory;




import com.stock.stockInventory.Stock.Stock;
import com.stock.stockInventory.StockService.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class ControllerClass
{
    @Autowired
    StockService stockService;

    // GET method to Display All Stocks
    @GetMapping("/stock/display")
    public List<Stock> getStock()
    {
        try
        {
            return this.stockService.getStock();
        }
        catch (Exception e)
        {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Empty Inventory.",e);
        }
    }
    // GET method to Display a Specific Stock
    @GetMapping("/stock/display/{stockId}")
    public Stock getStock(@PathVariable String stockId)
    {
        try
        {
            return this.stockService.getStock(Long.parseLong(stockId));
        }
        catch(Exception e)
        {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Stock is not in inventory.",e);
        }

    }

    // POST method to create Stock
    @PostMapping("/stock/create")
    public Stock addStock(@RequestBody Stock stock)
    {
        try
        {
            return this.stockService.addStock(stock);
        }
        catch(Exception e)
        {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"Unable to add new entry.",e);
        }

    }

    // Update stock from Inventory
    @PutMapping("/stock/update")
    public Stock updateStock(@RequestBody Stock stock)
    {
        try
        {
            return this.stockService.updateStock(stock);
        }
        catch(Exception e)
        {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"Unable to update entry.",e);
        }

    }

    // Delete Stock from Inventory
    @DeleteMapping("/stock/delete/{stockId}")
    public ResponseEntity<HttpStatus> removeStock(@PathVariable String stockId)
    {
        try
        {
            this.stockService.deleteStock(Long.parseLong(stockId));
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        }
        catch(Exception e)
        {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"Entry not found.");
        }
    }
}
