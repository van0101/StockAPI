package com.stock.stockInventory;


import com.stock.stockInventory.Stock.Stock;
import com.stock.stockInventory.StockService.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
}
