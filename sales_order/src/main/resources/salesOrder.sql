--- PRODUCT table
CREATE TABLE PRODUCT(CODE VARCHAR(20), DESCRIPTION VARCHAR(50), PRICE DOUBLE, QUANTITY INTEGER);
ALTER TABLE PRODUCT ADD CONSTRAINT pk_prdCode PRIMARY KEY (CODE) ;

-- Customer table
DROP TABLE CUSTOMER;
CREATE TABLE CUSTOMER(CUST_NBR INT, CODE VARCHAR(20), NAME VARCHAR(50), ADDRESS VARCHAR(150),PHONE1 VARCHAR(13), PHONE2 VARCHAR(13),CREDIT DOUBLE, CREDIT_LIMIT DOUBLE);
ALTER TABLE CUSTOMER ADD CONSTRAINT pk_custNbr PRIMARY KEY (CUST_NBR);

CREATE TABLE ORDERS(ORDER_NBR INT, CUSTMR_NBR INT, TOT_PRICE DOUBLE);
ALTER TABLE ORDERS ADD CONSTRAINT pk_OrderId PRIMARY KEY (ORDER_NBR) ;
ALTER TABLE ORDERS ADD CONSTRAINT fk_custOrder FOREIGN KEY (CUSTMR_NBR) REFERENCES CUSTOMER(CUST_NBR);


-- Sales Table
DROP TABLE SALES
CREATE TABLE SALES(ORDER_NBR INT, PRD_CODE VARCHAR(20), QUANTITY INTEGER, UNIT_PRICE DOUBLE, TOT_PRICE DOUBLE);
ALTER TABLE SALES ADD CONSTRAINT fk_saleOrder FOREIGN KEY (ORDER_NBR) REFERENCES ORDERS(ORDER_NBR);
ALTER TABLE SALES ADD CONSTRAINT fk_salesProd FOREIGN KEY (PRD_CODE) REFERENCES PRODUCT(CODE);
