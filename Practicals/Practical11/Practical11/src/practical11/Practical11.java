package practical11;

import java.sql.*;

public class Practical11 {

    public static void main(String[] args) {
        Connection conn;
        Statement stmt;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
//            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Trying to connect with Database Server..");

            conn = DriverManager.getConnection("jdbc:mysql://localhost/", "root", "");

            System.out.println("Connection Established Successfully...");

            System.out.println("Trying to create Database..");
            stmt = conn.createStatement();
            String sql = "CREATE DATABASE STUDENTDB";
            stmt.executeUpdate(sql);
            System.out.println("Database Created Successfully...");

            conn.close();
            stmt.close();
        } catch (Exception e) {
            System.out.println("Exception Caught." + e);
        }
    }

}
