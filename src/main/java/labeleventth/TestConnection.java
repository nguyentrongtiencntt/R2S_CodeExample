package labeleventth;

import java.sql.*;

public class TestConnection {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //Class.forName("com.mysql.jdbc.Driver");
        //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

        Connection conn;
        try {
            String url = "jdbc:mysql://localhost:3306/share_code?" +
                                        "allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";

            conn = DriverManager.getConnection(url, "root", "password");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        Statement stmt = null;
        try {
            stmt = conn.createStatement(); // or
//            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
//                    ResultSet.CONCUR_UPDATABLE);

        } catch (SQLException e) {
        }
        //finally { stmt.close(); }

        ResultSet rs = stmt.executeQuery("select * from banner");

        while(rs.next()){
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }

        System.out.println(conn);
    }
}
