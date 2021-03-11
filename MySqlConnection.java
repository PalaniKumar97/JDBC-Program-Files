import java.sql.*;

class MySqlConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "Palanikumar@1997");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from StudentInfo");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
