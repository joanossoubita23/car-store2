import java.util.Scanner;

public class CarApp {
    private  static CarDao carDao=new CarImplementation(JDBConnection.getConnection());

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int choice;
        do {
            System.out.println("""
                    Welcome to CarStore
                    Enter your Option
                    1- Add a car
                    2-Update a Car
                    3-Delete Car
                    4-Display Cars
                    5-Display All car
                    6-Exit the Programme
                    """);
            choice= sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    addCar(sc);
                    break;
                case 2:
                    updateCar(sc);
                    break;
                case 3:
                    deleteCar(sc);
                    break;
                case 4:
                    displayCar(sc);
                    break;
                case 5:
                    displayCar(sc);
                    break;
                case 6:
                    System.out.println("EXIT..");
                default:
                    System.out.println("Wrong input try again");

            }
        }while (choice!=6);
    }

    private static void deleteCar(Scanner sc) {
        System.out.println("Please enter a car you need to delete");
        String Carname=sc.nextLine();
        sc.nextLine();
        Car car=carDao.getCarByname(Carname);
        if (car==null){
            System.out.println("no car to delete");
        }
        String carname = null;
        carDao.deleteCar(carname);
    }


    private static void updateCar(Scanner sc) {
        System.out.println("Enter BCar id to update");
        int carID=sc.nextInt();
        sc.nextLine();

    }

    private static void displayCar(Scanner sc) {
        for (Car car : carDao.getAllCars()) {
            System.out.println(car);
        }
    }

    private static void deleteC(Scanner sc) {
        System.out.println("Please enter Car id ");
        String carname = sc.nextLine();
        Car car =  carDao.getCarByname(carname);
        if(car == null){
            System.out.println("No Car found ");
        } else
            System.out.println(car);
    }


    private static void addCar(Scanner sc) {
        System.out.println("PLease enter  Car name ");
        String name = sc.nextLine();
        System.out.println("Please enter a Car Model");
        String model = sc.nextLine();
        System.out.println("Please enter Car year");
        int year = sc.nextInt();
        Car car = new Car(name, model,year);
        carDao.addCar(car);
        System.out.println("Car successfully added ");

    }
}
