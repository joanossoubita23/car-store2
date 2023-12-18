import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCconnection {
    private static final String DB_Url="jdbc:mysql://127.0.0.1:3306/carStore";
    private  static final String DB_User="root";
    private  static final String passowrd="";
    public static void getConnection() throws SQLException {
        Connection conn=null;
        try {
            conn= DriverManager.getConnection(DB_Url,DB_User,passowrd);
            System.out.println("Connection successully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
    }
}
