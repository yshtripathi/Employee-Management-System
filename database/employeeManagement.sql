CREATE DATABASE IF NOT EXISTS employeeManagement;
USE employeeManagement;


CREATE TABLE IF NOT EXISTS login (
    username VARCHAR(20),
    password VARCHAR(20)
);


INSERT INTO login VALUES ('tyler', '123456789');


CREATE TABLE IF NOT EXISTS employee (
    name VARCHAR(40),
    fname VARCHAR(40),
    dob VARCHAR(40),
    address VARCHAR(40),
    phone VARCHAR(40),
    email VARCHAR(40),
    education VARCHAR(40),
    designation VARCHAR(40),
    salary VARCHAR(40),
    aadhar VARCHAR(40),
    empID VARCHAR(40)
);