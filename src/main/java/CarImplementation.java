import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarImplementation implements CarDao {
    private Connection connection;

    public CarImplementation(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void addCar(Car car) {
        try(PreparedStatement statement=connection.prepareStatement("INSERT INTO Carstore2 (name,year,model) VALUES(?,?,?")) {
            statement.setString(1, car.getCarName());
            statement.setString(2, car.getCarModel());
            statement.setInt(3,car.getCarYear());
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void updateCAr(Car car) {

    }

    @Override
    public void deleteCar(int CarID) {

    }

    @Override
    public Car getCarByID(int CarID) {
        Car car=null;
        try (PreparedStatement statement= connection.prepareStatement("SELECT * FROM Carstore2 WHERE carID =?")){
            statement.setInt(1,CarID);
            try (ResultSet rs =statement.executeQuery()){
                while (rs.next()){
                    int id =rs.getInt("CarID");
                    String Model= rs.getString("model");
                    int Year=rs.getInt("Year");
                    car=new Car(id,Model,Year);
                }

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return car;
    }

    @Override
    public List<Car> getAllCars() {
        List<Car> cars=new ArrayList<>();
        try (PreparedStatement statement=connection.prepareStatement("SELECT * FROM Carstore2")){


            try (ResultSet rs =statement.executeQuery()){
                while (rs.next()) {
                    int id = rs.getInt("CarID");
                    String Model = rs.getString("model");
                    int Year = rs.getInt("Year");
                    Car car = new Car(id, Model, Year);

                }
    }
} catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return  cars;
    }
}