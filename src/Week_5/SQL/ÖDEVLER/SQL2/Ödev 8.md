### 1. test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.

    CREATE TABLE employee (
    id INTEGER PRIMARY KEY,
    name VARCHAR(50),
    birthday DATE,
    email VARCHAR(100)
    );


### 2. Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.

 - insert into employee (id, name, birthday, email) values (1, 'Tudor', '1957-03-21', 'tsisse0@nydailynews.com');
 - insert into employee (id, name, birthday, email) values (2, 'Kiel', '1914-01-22', 'kiczokvitz1@cnn.com');
 - insert into employee (id, name, birthday, email) values (3, 'Gerhardine', '1912-07-17', 'goteague2@free.fr');
- insert into employee (id, name, birthday, email) values (4, 'Brock', '1941-06-17', 'btearle3@vimeo.com');
- insert into employee (id, name, birthday, email) values (5, 'Cornell', '2016-02-25', 'cpennick4@pinterest.com');
- insert into employee (id, name, birthday, email) values (6, 'Ulick', '1939-03-08', 'uwytchard5@earthlink.net');
- insert into employee (id, name, birthday, email) values (7, 'Fulton', '1968-01-07', 'flehucquet6@sakura.ne.jp');
- insert into employee (id, name, birthday, email) values (8, 'Basilio', '2013-06-28', 'bdunk7@spiegel.de');
- insert into employee (id, name, birthday, email) values (9, 'Herminia', '1965-06-08', 'hretallack8@4shared.com');
- insert into employee (id, name, birthday, email) values (10, 'Cal', '1973-09-13', 'climpertz9@goodreads.com');
- insert into employee (id, name, birthday, email) values (11, 'Harvey', '2020-03-15', 'hneilla@scientificamerican.com');
- insert into employee (id, name, birthday, email) values (12, 'Perry', '1984-04-30', 'pskipworthb@purevolume.com');
- insert into employee (id, name, birthday, email) values (13, 'Bryn', '1973-01-28', 'bandererc@telegraph.co.uk');
- insert into employee (id, name, birthday, email) values (14, 'Enrika', '1932-03-01', 'ebaswalld@umich.edu');
- insert into employee (id, name, birthday, email) values (15, 'Harv', '2001-01-05', 'hneale@paginegialle.it');
- insert into employee (id, name, birthday, email) values (16, 'Nora', '1965-05-27', 'nsaltresef@bloglines.com');
- insert into employee (id, name, birthday, email) values (17, 'Jermayne', '1993-06-01', 'jtoalg@ebay.com');
- insert into employee (id, name, birthday, email) values (18, 'Eal', '1980-02-20', 'eocooneyh@nasa.gov');
- insert into employee (id, name, birthday, email) values (19, 'Jade', '2018-09-22', 'jmonti@blogger.com');
- insert into employee (id, name, birthday, email) values (20, 'Vilhelmina', '1988-02-09', 'vmattusevichj@umn.edu');
- insert into employee (id, name, birthday, email) values (21, 'Emmy', '1945-05-07', 'espellicyk@europa.eu');
- insert into employee (id, name, birthday, email) values (22, 'Lorry', '1917-04-19', 'lbullel@reddit.com');
- insert into employee (id, name, birthday, email) values (23, 'Ardine', '1981-04-21', 'apittockm@miitbeian.gov.cn');
- insert into employee (id, name, birthday, email) values (24, 'Maisey', '1992-01-16', 'mseabrocken@linkedin.com');
- insert into employee (id, name, birthday, email) values (25, 'Forbes', '1940-06-24', 'fputmano@time.com');
- insert into employee (id, name, birthday, email) values (26, 'Ginni', '1900-04-05', 'gbransonp@go.com');
- insert into employee (id, name, birthday, email) values (27, 'Peria', '1988-05-08', 'pobradainq@joomla.org');
- insert into employee (id, name, birthday, email) values (28, 'Tessi', '2000-09-27', 'tjohananoffr@redcross.org');
- insert into employee (id, name, birthday, email) values (29, 'Vanessa', '1972-12-04', 'vpurseys@example.com');
- insert into employee (id, name, birthday, email) values (30, 'Franny', '1975-01-01', 'fkemeryt@guardian.co.uk');
- insert into employee (id, name, birthday, email) values (31, 'Mohandis', '1976-04-23', 'mcoyeu@sbwire.com');
- insert into employee (id, name, birthday, email) values (32, 'Maddie', '1953-05-07', 'mtimnyv@alibaba.com');
- insert into employee (id, name, birthday, email) values (33, 'Shellie', '1986-08-04', 'sdennistonw@ft.com');
- insert into employee (id, name, birthday, email) values (34, 'Stacee', '1929-01-16', 'stibbottsx@ucsd.edu');
- insert into employee (id, name, birthday, email) values (35, 'Kynthia', '2020-08-24', 'kknelly@google.cn');
- insert into employee (id, name, birthday, email) values (36, 'Horacio', '1909-07-19', 'hgibbensz@163.com');
- insert into employee (id, name, birthday, email) values (37, 'Eugenie', '1986-02-28', 'ecorse10@pinterest.com');
- insert into employee (id, name, birthday, email) values (38, 'Brady', '1946-04-05', 'bmargiotta11@ted.com');
- insert into employee (id, name, birthday, email) values (39, 'Tobi', '1908-12-08', 'tyackiminie12@mashable.com');
- insert into employee (id, name, birthday, email) values (40, 'Mariquilla', '1905-07-15', 'mrountree13@wordpress.org');
- insert into employee (id, name, birthday, email) values (41, 'Edith', '1919-11-25', 'efirks14@wix.com');
- insert into employee (id, name, birthday, email) values (42, 'Dennie', '1979-07-15', 'dcausby15@house.gov');
- insert into employee (id, name, birthday, email) values (43, 'Timothy', '1945-05-02', 'tbrinklow16@ezinearticles.com');
- insert into employee (id, name, birthday, email) values (44, 'Sargent', '1963-02-09', 'seastmead17@gnu.org');
- insert into employee (id, name, birthday, email) values (45, 'Christan', '2004-04-11', 'cmarlin18@oaic.gov.au');
- insert into employee (id, name, birthday, email) values (46, 'Arabelle', '1991-12-13', 'adrayn19@omniture.com');
- insert into employee (id, name, birthday, email) values (47, 'Ashlen', '1907-11-07', 'adanielot1a@mediafire.com');
- insert into employee (id, name, birthday, email) values (48, 'Jacquie', '1928-09-18', 'jdummer1b@wikipedia.org');
- insert into employee (id, name, birthday, email) values (49, 'Sophia', '1918-04-06', 'speaker1c@zdnet.com');
- insert into employee (id, name, birthday, email) values (50, 'Jim', '1962-08-07', 'jmosdill1d@nationalgeographic.com');

### 3. Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.

1. Bir çalışanın adını güncelleme:


    UPDATE employee
    SET name = 'John Doe'
    WHERE id = 1;

2. Bir çalışanın doğum tarihini güncelleme:


    UPDATE employee
    SET birthday = '1990-05-15'
    WHERE id = 2;

3. Bir çalışanın e-posta adresini güncelleme:


    UPDATE employee
    SET email = 'john.doe@example.com'
    WHERE id = 3;

4. Bir çalışanın adını ve e-posta adresini güncelleme:


    UPDATE employee
    SET name = 'Jane Smith', email = 'jane.smith@example.com'
    WHERE id = 4;

5. Bir çalışanın doğum tarihini ve e-posta adresini güncelleme:


    UPDATE employee
    SET birthday = '1985-10-20', email = 'new.email@example.com'
    WHERE id = 5;

### 4. Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

1. İsim (name) sütununa göre bir çalışanı silme:


    DELETE FROM employee
    WHERE name = 'Eloise';

2. Doğum tarihi (birthday) sütununa göre bir çalışanı silme:


    DELETE FROM employee
    WHERE birthday = '1958-05-30';

3. E-posta (email) sütununa göre bir çalışanı silme:


    DELETE FROM employee
    WHERE email = 'nslatford@va.gov';

4. Belirli bir id'ye (id) sahip çalışanı silme:


    DELETE FROM employee
    WHERE id = 10;

5. Birden fazla koşulu birleştirerek bir çalışanı silme:


    DELETE FROM employee
    WHERE name = 'Alexandr' AND birthday = '1936-11-13';