import java.util.List;

public interface CarDao {
    void addCar(Car car);
    void updateCAr(Car car);
    void deleteCar(String Carname);
    Car getCarByname(String Carname);
    List<Car> getAllCars();
}
