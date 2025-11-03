# Employee Management System

A simple **Java Swing and MySQL** based desktop application to manage employee details.

---

## Features
- Login authentication using MySQL database  
- Add, view, update and remove employees (upcoming)  
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
3. Create a table for employee:
   ```sql
   CREATE TABLE employee (
    name VARCHAR(40),
    fname VARCHAR(40),
    dob VARCHAR(40),
    salary VARCHAR(20),
    address VARCHAR(100),
    phone VARCHAR(20),
    email VARCHAR(50),
    education VARCHAR(40),
    designation VARCHAR(40),
    aadhar VARCHAR(20),
    empID VARCHAR(20));



## Clone_and_Run_This_Project:
  Step_1: Clone the repository
    - command: git clone https://github.com/yshtripathi/Employee-Management-System.git

  Step_2: Open the project in your preferred IDE
    - note: Use IntelliJ IDEA, Eclipse, or VS Code

  Step_3: Set up MySQL
    - note: Create the database and tables as mentioned above

  Step_4: Run the project
    - note: Run the Main or Login class file to start the application

