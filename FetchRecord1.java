import java.sql.*;
class FetchRecord1{
    public static void main(String args[])throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/College","root","Palanikumar@1997");
        Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet rs=stmt.executeQuery("select * from ProfessorInfo");

//getting the record of 3rd row
        rs.absolute(2);//specific row in the database..
        while(rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
        }
        con.close();
    }}