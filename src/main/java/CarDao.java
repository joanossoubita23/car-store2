import java.util.List;

public interface CarDao {
    void addCar(Car car);
    void updateCAr(Car car);
    void deleteCar(int CarID);
    Car getCarByID(int CarID);
    List<Car> getAllCars();
}
