import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private String userName = "root"; //ilgili db nin bilgilerine göre değişkenlik gösterir.
    private String password = "12345"; //ilgili db nin bilgilerine göre değişkenlik gösterir.
    private String dbUrl = "jdbc:mysql://localhost:3306/world"; //ilgili db nin bilgilerine göre değişkenlik gösterir.

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,password); //ilgili db ye bağlanmak için gerekli kod.
    }

    public void showErrorMessage (SQLException exception){ //hatayı yakalama
        System.out.println("Error: " + exception.getMessage());
        System.out.println("Error code: " + exception.getErrorCode());
    }
}
