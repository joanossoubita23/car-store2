import java.nio.charset.IllegalCharsetNameException;
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
        try(PreparedStatement statement=connection.prepareStatement("INSERT INTO Cars (name,model,Year) VALUES(?,?,?)")) {
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
        try (PreparedStatement statement=connection.prepareStatement("UPDATE Car name=?,model=?,year=?")){
            statement.setString(1,car.getCarName());
            statement.setString(2, car.getCarModel());
            statement.setInt(3,car.getCarYear());
            statement.setInt(4,car.getCarID());

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void deleteCar(String Carname) {
        try (PreparedStatement statement=connection.prepareStatement("DELETE FROM Car WHERE Carname=?")){


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }


    @Override
    public Car getCarByname(String Carname) {
        Car car=null;
        try (PreparedStatement statement= connection.prepareStatement("SELECT * FROM Cars WHERE carname =?")){
            statement.setString(1, "carname");
            try (ResultSet rs =statement.executeQuery()){
                while (rs.next()){
                    String carname =rs.getString("Carname");
                    String Model= rs.getString("model");
                    int Year=rs.getInt("Year");
                    car=new Car(carname,Model,Year);
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
        try (PreparedStatement statement=connection.prepareStatement("SELECT * FROM Cars")){


            try (ResultSet rs =statement.executeQuery()){
                while (rs.next()) {
                    String carname = rs.getString("Carname");
                    String Model = rs.getString("model");
                    int Year = rs.getInt("Year");
                    Car car = new Car(carname, Model, Year);
                    cars.add(car);

                }
    }
} catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return  cars;
    }
}