## Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.

### 1. actor ve customer tablolarında bulunan first_name sütunları için tüm verileri sıralayalım.

    -- Tüm actor verilerini sıralama
    SELECT first_name FROM actor;
    
    -- Tüm customer verilerini sıralama
    SELECT first_name FROM customer;


### 2. actor ve customer tablolarında bulunan first_name sütunları için kesişen verileri sıralayalım.

    -- Kesişen verileri sıralama
    SELECT DISTINCT actor.first_name
    FROM actor
    JOIN customer ON actor.first_name = customer.first_name;


### 3. actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralayalım.

    -- İlk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralama
    SELECT first_name FROM actor
    EXCEPT
    SELECT first_name FROM customer;

### 4. İlk 3 sorguyu tekrar eden veriler için de yapalım.

    -- Tüm actor verilerini sıralama
    SELECT first_name FROM actor;
    
    -- Tüm customer verilerini sıralama
    SELECT first_name FROM customer;
    
    -- Kesişen verileri sıralama
    SELECT DISTINCT actor.first_name
    FROM actor
    JOIN customer ON actor.first_name = customer.first_name;
    
    -- İlk tabloda bulunan ancak ikinci tabloda bulunmayan verileri sıralama
    SELECT first_name FROM actor
    EXCEPT
    SELECT first_name FROM customer;
