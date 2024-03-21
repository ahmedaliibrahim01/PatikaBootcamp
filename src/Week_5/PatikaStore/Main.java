package Week_5.PatikaStore;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Company PatikaStore = new Company("Patika Store");
        System.out.println("\n"+ PatikaStore.getName() + " Ürün Yönetim Paneli !\n" +
                "1 - Notebook İşlemleri\n" +
                "2 - Cep Telefonu İşlemleri\n" +
                "3 - Marka Listele\n" +
                "4 - Kategori Listele\n" +
                "0 - Çıkış Yap");

        // Lists
        TreeSet<Brand> brands = new TreeSet<>(new Sorter());
        List<Category> categories = new ArrayList<>();
        List<Phone> phones = new ArrayList<>();
        List<NoteBook> noteBooks = new ArrayList<>();

        //Brands
        brands.add(new Brand("Samsung"));
        brands.add(new Brand("Lenovo"));
        brands.add(new Brand("Apple"));
        brands.add(new Brand("Huawei"));
        brands.add(new Brand("Casper"));
        brands.add(new Brand("Asus"));
        brands.add(new Brand("HP"));
        brands.add(new Brand("Xiaomi"));
        brands.add(new Brand("Monster"));

        List<Brand> brandList = new ArrayList<>(brands);

        //Categories
        categories.add(new Category("Phone"));
        categories.add(new Category("Notebook"));

        //Phones
        phones.add(new Phone("SAMSUNG GALAXY A51", 3199, brandList.get(7).getName(), 128, 6.5,32,4000,6,"Sıyah"));
        phones.add(new Phone("iPhone 11 64 GB", 7379, brandList.get(0).getName(), 64, 6.1, 5, 3046,6,"Mavi"));
        phones.add(new Phone("Redmi Note 10 Pro 8GB", 4012,brandList.get(8).getName(),128,6.5,35,4000,12,"Beyaz"));

        //NoteBooks
        noteBooks.add(new NoteBook( "HUAWEI Matebook 14",7000,brandList.get(4).getName(), 512,14,16));
        noteBooks.add(new NoteBook("LENOVO V14 IGL", 3699,brandList.get(5).getName(), 1024,14,8));
        noteBooks.add(new NoteBook("ASUS Tuf Gaming",8199,brandList.get(1).getName(), 2048,15,32));

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nTercih yapınız : ");
        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("\nNotebook Listesi");
                for (NoteBook noteBook : noteBooks) {
                    System.out.println(noteBook.getId() + " : " + noteBook.getName() + " : " + noteBook.getPrice() + " : " + noteBook.getBrand() + " : " + noteBook.getStorage()+ " : " +noteBook.getScreenSize()+ " : " +noteBook.getRam());
                }
                break;
            case 2:
                System.out.println("\nCep Telefonu Listesi");
                for (Phone phone : phones) {
                    System.out.println(phone.getId()+ " : " +phone.getName()+ " : " +phone.getPrice()+ " : " +phone.getBrand()+ " : " +phone.getStorage()+ " : " +phone.getScreenSize()+ " : " +phone.getCamera()+ " : " +phone.getBattery()+ " : " +phone.getRam()+ " : " +phone.getColor());
                }
                break;
            case 3:
                System.out.println("\nMarka Listesi");
                for (Brand brand : brandList) {
                    System.out.println(brand.getName());
                }
                break;
            case 4:
                System.out.println("\nKategoriler");
                for (Category category : categories) {
                    System.out.println(category.getName());
                }
                break;
            case 0:
                System.out.println("\nÇıkış Yapıldı");
        }
    }
}
