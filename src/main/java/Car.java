public class Car {
    private String name;
    private  int year;
    private  String model;

    public Car(String name, int year, String model) {
        this.name = name;
        this.year = year;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", model='" + model + '\'' +
                '}';
    }
}
