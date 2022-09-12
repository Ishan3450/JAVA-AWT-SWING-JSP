package javaapplication3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JavaApplication3 {

    public static void main(String[] args) {
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava", "root", "");

            PreparedStatement pst = con.prepareStatement("insert into student values(?,?)");
            pst.setInt(1, 5);
            pst.setString(2, "Kingo");

            System.out.println("Rows inserted successfully !!");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
