package labeleventth;

import java.sql.*;

public class TestConnectionExample {
    private static String DB_URL = "jdbc:mysql://localhost:3306/schooldb";
    private static String USER_NAME = "root";
    private static String PASSWORD = "password";

    public static void main(String[] args) {
        Connection conn = null;
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            // create statement
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            // get DatabaseMetaData object
            DatabaseMetaData dbmd = conn.getMetaData();

            // show metadata of database
            System.out.println("Driver Name: " + dbmd.getDriverName());
            System.out.println("Driver Version: " + dbmd.getDriverVersion());
            System.out.println("UserName: " + dbmd.getUserName());
            System.out.println("Database Product Name: "
                    + dbmd.getDatabaseProductName());
            System.out.println("Database Product Version: "
                    + dbmd.getDatabaseProductVersion());



            // get data from table 'student'
            ResultSet rs
                    = stmt.executeQuery("SELECT * FROM tbl_student");
            // getting the record of 3rd row
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                        + "  " + rs.getString(3));
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            
        }
    }
}
