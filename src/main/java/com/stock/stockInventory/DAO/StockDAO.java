package com.stock.stockInventory.DAO;

import com.stock.stockInventory.Stock.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockDAO extends JpaRepository<Stock,Long>
{

}
