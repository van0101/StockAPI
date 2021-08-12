package com.stock.stockInventory;


import com.stock.stockInventory.Stock.Stock;
import com.stock.stockInventory.StockService.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        return this.stockService.getStock();
    }
    // GET method to Display a Specific Stock
    @GetMapping("/stock/display/{stockId}")
    public Stock getStock(@PathVariable String stockId)
    {
        return this.stockService.getStock(Long.parseLong(stockId));
    }

    // POST method to create Stock
    @PostMapping("/stock/create")
    public Stock addStock(@RequestBody Stock stock)
    {
        return this.stockService.addStock(stock);
    }

    // Update stock from Inventory
    @PutMapping("/stock/update")
    public Stock updateStock(@RequestBody Stock stock)
    {
        return this.stockService.updateStock(stock);
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
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
