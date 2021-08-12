package com.stock.stockInventory.Stock;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stock
{
    @Id
    private long stockNumber;
    private String Name;
    private long Price;
    private String date;
    private long Quantity;

    public Stock(long stockNumber, String name, long price, String date, long quantity)
    {
        this.stockNumber = stockNumber;
        Name = name;
        Price = price;
        this.date = date;
        Quantity = quantity;
    }
    public Stock()
    {
        super();
    }

    public long getStockNumber()
    {
        return stockNumber;
    }

    public void setStockNumber(long stockNumber)
    {
        this.stockNumber = stockNumber;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public long getPrice()
    {
        return Price;
    }

    public void setPrice(long price)
    {
        Price = price;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public long getQuantity()
    {
        return Quantity;
    }

    public void setQuantity(long quantity)
    {
        Quantity = quantity;
    }

    @Override
    public String toString()
    {
        return "Stock{" +
                "stockNumber=" + stockNumber +
                ", Name='" + Name + '\'' +
                ", Price=" + Price +
                ", date='" + date + '\'' +
                ", Quantity=" + Quantity +
                '}';
    }
}
