package web.model;

public class Car {

    private int id;
    private String model;
    private int serial;

    public Car() {
    }

    public Car(int id, String model, int serial) {
        this.model = model;
        this.serial = serial;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", serial='" + serial + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
