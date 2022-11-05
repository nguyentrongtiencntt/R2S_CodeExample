package labeleventth;

import java.sql.*;

public class JDBCExample {
    // Ten cua driver va dia chi URL cua co so du lieu
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/share_code";

    //  Ten nguoi dung va mat khau cua co so du lieu
    static final String USER = "root";
    static final String PASS = "password";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            // Buoc 2: Dang ky Driver
            Class.forName("com.mysql.jdbc.Driver");

            // Buoc 3: Mo mot ket noi
            System.out.println("Dang ket noi toi co so du lieu ...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            // Buoc 4: Thiet lap auto commit la false.
            conn.setAutoCommit(false);

            // Buoc 5: Thuc thi truy van
            System.out.println("Tao cac lenh truy van SQL ...");
            stmt = conn.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);

            // Buoc 6: Chen mot hang vao trong bang
            System.out.println("\nChen mot hang ...");
            String SQL = "INSERT INTO banner " +
                    "VALUES (6, 'Web', 1,'https://www.google.com/')";
            stmt.executeUpdate(SQL);

            // Buoc 7: Chen them mot hang vao trong bang sinhvienk60
            SQL = "INSERT INTO banner " +
                    "VALUES (7, 'Desktop', 2,'https://www.google.com/')";
            stmt.executeUpdate(SQL);

            // Buoc 8: commit all change
            System.out.println("\n commit change...");
            conn.commit();

            // Buoc 9: Liet ke tat ca cac ban ghi.
            String sql = "SELECT * FROM banner";
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println("\nLiet ke result set de tham chieu ...");
            printRs(rs);

            // Buoc 10: Don sach moi truong va giai phong resource
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            // Xu ly cac loi cho JDBC
            se.printStackTrace();
            // Neu xuat hien loi thi xoa sach cac thay doi
            // va tro ve trang thai truoc khi co thay doi.
            System.out.println("\nQuay ve trang thai truoc thay doi ...");
            try{
                if(conn!=null)
                    conn.rollback();
            }catch(SQLException se2){
                se2.printStackTrace();
            }// Ket thuc khoi try

        }catch(Exception e){
            // Xu ly cac loi cho Class.forName
            e.printStackTrace();
        }finally{
            // Khoi finally duoc su dung de dong cac resource
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }// Ket thuc khoi finally
        }// Ket thuc khoi try
    }// Ket thuc main

    public static void printRs(ResultSet rs) throws SQLException{
        // Bao dam chung ta da bat dau tu hang dau tien
        rs.beforeFirst();
        while(rs.next()){
            // Lay du lieu boi su dung ten cot
            int id  = rs.getInt("id");
            int description = rs.getInt("description");
            int display_order = rs.getInt("display_order");
            String image_filepath = rs.getString("image_filepath");

            // Hien thi cac gia tri
            System.out.print("\nid: " + id);
            System.out.print("\ndescription: " + description);
            System.out.println("\ndisplay_order: " + display_order);
            System.out.print("\nimage_filepath: " + image_filepath);
            System.out.print("\n=================");
        }
        System.out.println();
    }// Ket thuc printRs()
}
