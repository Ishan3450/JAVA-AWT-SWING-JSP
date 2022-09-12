package javaapplication2;

import java.sql.*;

public class JavaApplication2 {

    public static void main(String[] args) {
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava", "root", "");
            Statement stmt = con.createStatement();
            String qry = "insert into student values(4,'Abba Jabba')";
            int result = stmt.executeUpdate(qry);
            if (result == 1) {
                System.out.println("Rows Inserted Successfully");
            } else {
                System.out.println("Something went wrong !!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
