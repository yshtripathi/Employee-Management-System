# Employee Management System

A simple **Java Swing and MySQL** based desktop application to manage employee details.

---

## Features
- Login authentication using MySQL database  
- Add, view, and remove employees (upcoming)  
- Simple and user-friendly interface  
- Splash screen at startup  
- Uses JDBC for database connectivity  

---

## Technologies Used
- Java  
- Swing and AWT (for GUI)  
- MySQL (Database)  
- JDBC (Connectivity)

---

## How to Run
1. Install MySQL and create a database named `employeeManagement`.
2. Create a table for login:
   ```sql
   CREATE TABLE login (
       username VARCHAR(50),
       password VARCHAR(50)
   );

   INSERT INTO login VALUES ('admin', 'admin123');
