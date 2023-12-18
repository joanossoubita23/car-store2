import java.util.List;

public interface CRUDcar {
    void addCar(Car car);
    void UpdateCar(Car car);
    void deleteCar(Car car);
    Car getCarId();
    List<Car>getAllCar();
}
