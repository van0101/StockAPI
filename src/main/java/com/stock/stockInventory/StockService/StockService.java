package com.stock.stockInventory.StockService;

import com.stock.stockInventory.Stock.Stock;

import java.util.List;

public interface StockService
{
    List<Stock> getStock();
    Stock getStock(long stockId);
    Stock addStock(Stock stock);
    Stock updateStock(Stock stock);
    void deleteStock(long stockId);

}
