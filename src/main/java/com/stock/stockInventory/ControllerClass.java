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

    // GET method to return List of Stock
    @GetMapping("/stock")
    public List<Stock> getStock()
    {
        return this.stockService.getStock();
    }
    // GET method to return a specific stock
    @GetMapping("/stock/{stockId}")
    public Stock getStock(@PathVariable String stockId)
    {
        return this.stockService.getStock(Long.parseLong(stockId));
    }

    // POST method to add Stock
    @PostMapping("/stock")
    public Stock addStock(@RequestBody Stock stock)
    {
        return this.stockService.addStock(stock);
    }

    // Update stock
    @PutMapping("/stock")
    public Stock updateStock(@RequestBody Stock stock)
    {
        return this.stockService.updateStock(stock);
    }

    // Delete
    @DeleteMapping("/stock/{stockId}")
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
