public class Car {
    private  int carID;
    private int carYear;
    private String carName;
    private String carModel;

    public Car(int carID, int carYear, String carName, String carModel) {
        this.carID = carID;
        this.carYear = carYear;
        this.carName = carName;
        this.carModel = carModel;
    }

    public Car(int id, String model, int year) {
    }

    public Car(String name, String model, int year) {
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carID=" + carID +
                ", carYear=" + carYear +
                ", carName='" + carName + '\'' +
                ", carModel='" + carModel + '\'' +
                '}';
    }
}
