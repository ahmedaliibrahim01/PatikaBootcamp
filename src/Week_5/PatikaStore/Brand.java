package Week_5.PatikaStore;

public class Brand {
    private String name;
    private int id = 0;

    public Brand(String name) {
        this.name = name;
        this.id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

}
