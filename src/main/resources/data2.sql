DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS accounts;



CREATE TABLE customer (
  customer_id int AUTO_INCREMENT  PRIMARY KEY,
  name varchar(100) NOT NULL,
  email varchar(100) NOT NULL,
  mobile_number varchar(20) NOT NULL,
  create_dt date DEFAULT NULL
);

CREATE TABLE accounts (
  customer_id int NOT NULL,
  account_number int AUTO_INCREMENT  PRIMARY KEY,
  account_type varchar(100) NOT NULL,
  branch_address varchar(200) NOT NULL,
  create_dt date DEFAULT NULL,
   foreign key (customer_id) references customer (customer_id)
);

INSERT INTO accounts (customer_id,account_number,account_type, branch_address, create_dt)
 VALUES (1,18976056411,'Savings','123 Main Street, New York','2022-07-23');
 
 INSERT INTO accounts (customer_id,account_number,account_type, branch_address, create_dt)
 VALUES (1,18976056412,'Loan','123 Main Street, New York', CURDATE());
 
 INSERT INTO accounts (customer_id,account_number,account_type, branch_address, create_dt)
 VALUES (2,18976056431,'Savings','123 Main Street, New York', CURDATE());
 
 INSERT INTO accounts (customer_id,account_number,account_type, branch_address, create_dt)
 VALUES (2,18976056432,'Loan','123 Main Street, New York', CURDATE());
 
 
 INSERT INTO accounts (customer_id,account_number,account_type, branch_address, create_dt)
 VALUES (3,18976056415,'Savings','123 Main Street, New York', '2022-07-12');

