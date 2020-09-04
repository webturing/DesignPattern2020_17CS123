package zjdp.template.p6;

import java.sql.DriverManager;
import java.sql.SQLException;

public class OperationAccessDatabase extends OperationDatabase {
    OperationAccessDatabase(String dataBase, String tableName) {
        super(dataBase, tableName);
    }

    public void loadDriver() {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("" + e);
        }
    }

    public void createConnection() {
        try {
            String str = "jdbc:odbc:" + dataBase;
            String user = "";
            String password = "";
            con = DriverManager.getConnection(str, user, password);
        } catch (SQLException exp) {
            System.out.println("" + exp);
        }
    }
}
