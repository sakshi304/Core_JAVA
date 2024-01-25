package JDBC_Prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class first {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql:sakshi");
        Statement stm=con.createStatement();
        ResultSet rs = stm.executeQuery("select * from employee");
        int dno;
        String dname;
        while(rs.next()){
            dno=rs.getInt(1);
            dname=rs.getString(2);
            System.out.println(dno+" "+dname);
        }

    }
}
