package com.sonata.Dao1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sonata.model.Customer;

public class customerDao {



   public int registerCustomer(Customer customer) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO customer values(?,?,?,?);";



       int result = 0;



       Class.forName("com.mysql.jdbc.Driver");



       try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/customers", "root", "root@123");



           // Step 2:Create a statement using connection object
            PreparedStatement ps = connection.prepareStatement(INSERT_USERS_SQL)) {
           
            ps.setString(1, customer.getFirstname());
            ps.setString(2, customer.getLastname());
  
            ps.setString(3, customer.getAddress());
            ps.setString(4, customer.getContact());



           System.out.println(ps);
            // Step 3: Execute the query or update query
            ps.executeUpdate();



       } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return result;
    }



   private static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}