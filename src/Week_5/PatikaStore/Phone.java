package Week_5.PatikaStore;

public class Phone extends Product{
    private int camera;
    private double battery;
    private String color;
    private static long idCounter = 0;
    private long id;


    public Phone(String name, int price, String brand, int storage, double screenSize, int camera, double battery, int ram, String color) {
        super(name, price, brand, storage, screenSize, ram);
        this.camera = camera;
        this.battery = battery;
        this.color = color;
        idCounter++;
        this.id = idCounter;
    }

    public long getId() {
        return id;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
