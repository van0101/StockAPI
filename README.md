# StockAPI
A RESTful service using Spring boot and MYSQL for stock inventory management.

## Features
1. Display all stocks in inventory.
2. Display a specific stock in the inventory using the stock id.
3. Add a new stock entry in the database.
4. Update attribute(s) of an entry.
5. Delete an existing stock entry from the database.

## URL's

1. Display all entries [GET] : /stock/display
2. Display specific entry [GET] : /stock/display/{stockId}
3. Add new stock [POST] :/stock/create
4. Update entry [PUT] : /stock/update
5. Delete entry [DELETE] : /stock/delete/{stockId}

## Databse Used 
1. Application : MySQL Workbench
2. Driver Class Name : com.mysql.cj.jdbc.Driver

![image](https://user-images.githubusercontent.com/53475276/129138888-1281a9c7-71d1-4b8c-8b43-09cc661b5196.png)


## Postman Screenshots

1. GET display all: 
![image](https://user-images.githubusercontent.com/53475276/129136766-87f0d428-df15-4035-a840-f6d9dd2e35e5.png)

2. GET display specific entry:
![image](https://user-images.githubusercontent.com/53475276/129137317-0a21668c-f548-44eb-b56a-1b6e5f138d8b.png)

3. Add new entry:
![image](https://user-images.githubusercontent.com/53475276/129137416-556f837a-28aa-4c35-8715-b1946c543073.png)

4. Update an entry:
![image](https://user-images.githubusercontent.com/53475276/129137665-1f02ae51-8943-4167-845d-64c08c29f5c6.png)

5. Delete an entry:
Entry removed (Status 202 Accepted)
![image](https://user-images.githubusercontent.com/53475276/129137745-6f70d5b1-38bc-4c9c-8fdd-24970a577c5b.png)
Entry removed from database
![image](https://user-images.githubusercontent.com/53475276/129138066-e3256789-6563-49c4-87c1-1b7faef70de3.png)


