import domain.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("library_management_system");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            Author author = new Author("Ahmed", LocalDate.of(1990, 1, 1),"Somalia");
            Category category = new Category("Books", "You can find books");
            Category c1 = new Category("Pens", "You can find pens");
            Publisher publisher = new Publisher("Hamar", LocalDate.ofYearDay(2024, 1),"Mogadishu/Somalia");

            // Kategorileri liste olarak oluştur
            List<Category> categories = new ArrayList<>();
            categories.add(category);
            categories.add(c1);

            Book book = new Book("Love",LocalDate.of(2024,5,1), 50,author,publisher,categories);
            BookBorrowing bookBorrowing = new BookBorrowing("Mohamed",LocalDate.now(),null,book);

            entityManager.persist(author);
            entityManager.persist(book);
            entityManager.persist(bookBorrowing);
            entityManager.persist(category);
            entityManager.persist(c1);
            entityManager.persist(publisher);
            transaction.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
