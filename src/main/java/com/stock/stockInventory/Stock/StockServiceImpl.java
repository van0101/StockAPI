package com.stock.stockInventory.Stock;

import com.stock.stockInventory.DAO.StockDAO;
import com.stock.stockInventory.StockService.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService
{
    List<Stock> list;

    @Autowired
    private StockDAO stockDAO;

    @Override
    public List<Stock> getStock()
    {
        return stockDAO.findAll();
    }

    @Override
    public Stock getStock(long stockId)
    {
        return stockDAO.findById(stockId).get();
    }

    @Override
    public Stock addStock(Stock stock)
    {
        return stockDAO.save(stock);
    }
}
