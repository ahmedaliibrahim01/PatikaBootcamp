package Week_5.PatikaStore;

public class Brand {
    private String name;
    private static long idCounter = 0;
    private long id;

    public Brand(String name) {
        this.name = name;
        idCounter++;
        this.id = idCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

}
