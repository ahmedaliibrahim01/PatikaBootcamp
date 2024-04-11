package Week_5.PatikaStore;

public class PBrand {
    private String name;
    private static long idCounter = 0;
    private long id;

    public PBrand(String name) {
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
