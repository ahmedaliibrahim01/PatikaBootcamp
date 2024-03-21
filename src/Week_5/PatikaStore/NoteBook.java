package Week_5.PatikaStore;

public class NoteBook extends Product{
    private static long idCounter = 0;
    private long id;
    public NoteBook(String name, int price, String brand, int storage, double screenSize, int ram) {
        super(name, price, brand, storage, screenSize, ram);
        idCounter++;
        this.id = idCounter;
    }

    public long getId() {
        return id;
    }

}
