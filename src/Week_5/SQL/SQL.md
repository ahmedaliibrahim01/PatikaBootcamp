## SQL
### NOTES
1. Comment  --
2. SQL is not case-sensitive
3. SQL codes saying Query
4. Query History = daha yazmış olduğunuz komutları görebilirsiniz

### SELECT
1. **SELECT** = veritabanından veri sorgulamak için kullanılan bir komuttur. SELECT ifadesi, belirli sütunları veya tüm sütunları seçmek için kullanılır ve bir veya birden fazla tablodan veri almak için kullanılabilir.
2. Select columName FROM tableName
3. Select istediğimizVeri From istediğimizYerden
4. Select * (yıldız) all(hepsi) anlamına gelir.

### SELECT DISTINCT
**SELECT DISTINCT** =  SQL'de bir sorgu sonucunda yinelenen değerleri kaldırmak için kullanılan bir anahtardır. Bu, belirli bir sütunda veya sütunlarda aynı değere sahip olan birden fazla satırın yalnızca bir kere gösterilmesini sağlar.


### WHERE
1. **WHERE**  = bir sorguda belirli bir koşulu karşılayan satırları filtrelemek için kullanılır.
2. **WHERE**  = filtreleme
3. String filtreleme yaparken 'tek tirnak ' kullanmak zorunludur.

### WHERE LIST
1. Comparison Operators
2. Logical Operators
3. BETWEEN 
4. IN
5. LIKE
6. I LIKE

### Comparison Operators
| Operator | Description                |
|----------|----------------------------|
| datatype < datatype | Less than                  |
| datatype > datatype | Greater than               |
| datatype <= datatype | Less than or equal to      |
| datatype >= datatype | Greater than or equal to  |
| datatype = datatype | Equal                      |
| datatype <> datatype | Not equal                  |
| datatype != datatype | Not equal                  |


### Logical Operators
1. boolean AND boolean → boolean
2. boolean OR boolean → boolean
3. NOT boolean → boolean

| a       | b       | a AND b | a OR b | NOT a |
|---------|---------|---------|--------|-------|
| true    | true    | true    | true   | false |
| true    | false   | false   | true   | false |
| true    | null    | null    | true   | false |
| false   | false   | false   | false  | true  |
| false   | null    | false   | null   | true  |
| null    | null    | null    | null   | null  |

- `a AND b`: `a` ve `b` değerleri hem `true` olduğunda sonuç `true` olur, diğer durumlarda sonuç `false` olur. (`null` değerler sonucu `null` yapar)
- `a OR b`: `a` veya `b` değerleri `true` olduğunda sonuç `true` olur, diğer durumlarda sonuc `false` olur. (`null` değerler sonucu `null` yapar)
- `NOT a`: `a` değeri `true` ise sonuç `false`, `false` ise sonuç `true`, `null` ise sonuç `null` olur.
       
### NOT IN 
**Not in** = Bu operatör, bir alt sorgudaki belirli değerlerin listesinde bulunmayan değerleri seçmek için kullanılır.

    WHERE column_name NOT IN (value1, value2, ...);

### BETWEEN
**Between** = belirli bir aralıkta değerleri sorgulamak için kullanılan bir operatördür. Bu operatör, bir değerin belirli bir aralık içinde olup olmadığını kontrol etmek için kullanılır. BETWEEN operatörü genellikle WHERE ifadesi içinde kullanılır. 

    SELECT * FROM film
    WHERE length BETWEEN 90 AND 120;

### IN
**IN** = sorgularında bir sütundaki değerlerin belirli bir liste içinde olup olmadığını kontrol etmek için kullanılan bir operatördür. Bu operatör, bir değerin belirli bir liste içinde bulunup bulunmadığını kontrol etmek için kullanılır.  IN operatörü genellikle WHERE ifadesi içinde kullanılır

    SELECT column_name(s)
    FROM table_name
    WHERE column_name IN (value1, value2, ...);


### LIKE
**LIKE** = bir sorguda belirli bir deseni veya karakter dizisini aramak için kullanılan bir operatördür. Genellikle bir "WHERE" ifadesi içinde kullanılır ve bir sütunun değerinin belirli bir desene uyan bir değeri içerip içermediğini kontrol etmek için kullanılır.
Temelde iki önemli özel karakter bulunur:

    %: Herhangi bir karakterlerin sıfır, bir veya birden fazla tekrarını temsil eder.
    _: Tek bir karakteri temsil eder.

### ILIKE
**ILIKE** = "LIKE" operatörünün benzer bir versiyonudur, ancak büyük-küçük harf duyarsız eşleşmeleri gerçekleştirir. Bu operatör, karakterlerin büyük veya küçük harf olup olmadığına bakmaksızın desen eşleşmesi yapar.

Temel olarak, "ILIKE" operatörü, "LIKE" operatöründen farklı olarak büyük/küçük harf farkını göz ardı eder.

### LIMIT
**LIMIT** = bir sorgunun sonuç kümesindeki satır sayısını sınırlamak için kullanılan bir anahtar kelimedir. Genellikle bir "SELECT" sorgusu ile kullanılır ve geri döndürülen sonuç kümesinin belirli bir sayıda satır içermesini sağlar. Bu, büyük veri kümeleri üzerinde çalışırken sorgu sonuçlarını kontrol etmek ve yönetmek için yaygın bir tekniktir.

### OFFSET
**OFFSET** = genellikle "LIMIT" ifadesiyle birlikte kullanılır. "OFFSET", sonuç kümesinde belirli bir konumdan başlayarak sonuçları alma işlemi için kullanılır. Yani, sonuç kümesinde belirli bir başlangıç noktasından itibaren sonuçları almak için kullanılır.

Örneğin, "LIMIT" ve "OFFSET" ifadelerini birlikte kullanarak, bir sonuç kümesinin belirli bir sayfa numarasından başlayarak belirli bir sayıda satırın alınmasını sağlayabilirsiniz.

