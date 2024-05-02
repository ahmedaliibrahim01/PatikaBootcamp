# JPA

## Maven Proje Oluşturma

`1`. Yeni proje oluştur ve maven seç

`2`. pom.xml istediğin dependency ları ekle.
 - `1` Database 
 - `2` ORM 
 - `3` Framework

## Bağımlılıkların Yüklenmesi

`1`. Maven paketleri bulunan siteler.

 - `1` Searchmave :  https://search.maven.org/?eh=
 - `2` Mvn Repository : https://mvnrepository.com/

`2`. Istediğin paketi site arama cubuğuna yaz ve dependency kodlarını koplaya
   
**Örnek**
- `1`. Postgresql
- `2`. Hibernate
- `3`. Kopyaladığın dependency ları pom.xml yapıştır
- `4`. pom.xml dosyası sağa tıkla ardından maven seçip Reload Project tıkla
- `5`. Eklemış olduğun paketleri External Libraries kısmında görebileceksin ve kullanaya başlayabilirsin

## JPA Kurulumu ve Config İşlemleri

- `1` JPA Konfigürasyon Dosyasının Oluşturulması : JPA kullanımı için bir konfigürasyon dosyası oluşturulmalıdır. Bu dosya, genellikle "persistence.xml" olarak adlandırılı. Bu ayarları src/main/resources/META-INF/persistence.xml dosyasında yapacağız. Bu dosya, JPA'nın kullanılacak veri tabanı ve diğer ayarları belirlemesine olanak tanır.
- `2` META-INF dosyası oluştur
- `3` persistence.xml oluştur
- `4` Konfigrasyon kodları yaz. database connection ve hibernate gibi

## Entity
`1` Bir sınıf entity olabilmesi için bazı annotations alması gerekir
- @Entity 
- @Id
- Empty constructor

`2`Bir Tablo isim  vermek, veri tipini belirlemek, constraints belirlemek için @Table annotation kullanılır.
- @Table(name "employee")

`3`Bir Column özellikle id primary key yapmak için @GeneratedValue anotasyonu kullanılır
- @GeneratedValue(strategy = GenerationType.IDENTITY)

`4`Bir column (sütün) isim vermek, veri tipini belirlemek, constraints belirlemek için @Column annotation kullanılır
- @Column(name = "name", length = 255, nullable = false)

`5`Date ile işlemler yapmak column (sütün) kullanmak için  @Temporal anotasyonu kullanılır
- @Temporal(TemporalType.DATE)

`6`Uzun yazı alan bir sutun oluşturmak için @Lob anotasyonu kullanılır
- @Lob
## EntityManager Oluşturulması
`1`**EntityManagerFactory:**
 - EntityManagerFactory, uygulamanın başlangıcında oluşturulan ve genellikle uygulamanın yaşam döngüsü boyunca paylaşılan bir fabrikadır.
 - EntityManagerFactory, persistence.xml dosyasındaki yapılandırmaya dayanarak EntityManager'ları oluşturur ve yönetir.
 - Tipik olarak, bir EntityManagerFactory, uygulamanın tüm EntityManager'larını oluşturmak için kullanılır.

`2`**EntityManager:**
 - EntityManager, belirli bir işlem (transaction) veya sorgu için kullanılan JPA arayüzüdür.
 - EntityManager, bir EntityManagerFactory'den oluşturulur.
 - EntityManager, belirli bir işlem süresince birimlerin (entities) yönetimini sağlar. Bu, veritabanından birimlerin yüklenmesi, değiştirilmesi, kaydedilmesi veya silinmesi gibi işlemleri içerir.
 - EntityManager, işlem tamamlandığında kapatılmalıdır.

`3`**EntityTransaction:**
 - EntityTransaction, bir EntityManager içinde bir işlem başlatmak ve yönetmekten sorumludur. 
 - Bir iş birimi içindeki (unit of work) veritabanı işlemlerini işlem başlatma, commit etme veya geri alma yeteneği sağlar. 
 - Bir işlem tamamlandığında, değişikliklerin kalıcı hale getirilmesini (commit) sağlar veya geri alınmasını (rollback) sağlar.

## JPA ile CRUD İşlemler (Persist, Merge)
`1`**CRUD işlemleri yapmak için**

- `1`Veritabanı oluştur

- `2`pom.xml dependency leri oluştur (hibernate, postgresql vs.)

- `3`META-INF dosyası oluştur

- `4`persistence.xml oluştur

- `5`Database connection properties (veri tabani bağlantısı kur)

- `6`Hibernate properties (hibernate konfigrasyonu yap).

- `7`CRUD işlemleri yapacağin tabloyu sınıf olarak oluştur

- `8`Entity anotasyonları yaz

- `9`EntityManagerFactory nesnesi oluştur (persistence) kullanrak

- `10`EntityManager nesnesi oluştur (EntityManagerFactory) kullanrak

`2` **Create Table**

- `1` Eğer varolan tablo silip yeni tablo oluşturmak istiyorsan persistence.xml da hibernate konfigrasyonlarında 'create' yap.

- `2` Eğer varolan tablo silmeyip yeni tablo oluşturmak istiyorsan persistence.xml da hibernate konfigrasyonlarında 'update' yap

`3` **Creat Row - Persist (add data)**
- `1` veritabanı veri eklemek için `persist` kullanılır.
- `2` veritabana eklemek istediğim nesneyi oluştururuz.
- `3` nesne oluştururken constracture doldururuz veya set metotu kullanarak doldururuz.
- `4` transaction.begin(); açalır
- `5` entitymanager.persist(nesne); - entity kullanarak persist içine nesne koyulur
- `6` transaction.commit(); ile kapatılır
- `7` persistence.xml konfigrasyonu update veya create olması gerekir, 

`4` **Find**
- `1` veritabanından id kullanarak veri çekmek için `Find` kullanılır.
- entityManager find metotunu kullanırız
- `2` Object obj = entityManager.find(Obj.class, id);
- `3` veritabanindan veri çekmek istediğimiz tablonun karşılığı olan entity sınıfı kullanrak entityManager.find kullanırı
- `4` find metotu iki parametre alır, birincisi obje ismi .class yazılır
- `5` ikincisi ise id numarasını yazılır

`5` **Merge - Update**
- `1` Veritabaninda olan bir veriyi güncelemek için `merge` kullanılır
- `2` önce find metotu kullanarak id belirtilir
- `3` set metotu kullanarak veriyi güncellenir
- `4` transaction.begin(); açalır
- `5` entityManager.merge(obj)
- `5` transaction.commit(); ile kapatılır

`6` **Remove**
- `1` Veritabaninda olan bir veriyi silmek için `remove` kullanılır
- `2` önce find metotu kullanarak id belirtilir
- `3` transaction.begin(); açalır
- `4` entityManager.merge(obj) // remove işlemi gerçekleşir
- `5` transaction.commit(); ile kapatılır