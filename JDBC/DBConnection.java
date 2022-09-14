package com.sonata.DAO1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
public Connection connection;

public Connection getConnection() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_details","root","root@123");
	}catch (ClassNotFoundException e ) {e.fillInStackTrace();}
	 catch (SQLException s) {s.printStackTrace();}
	
	return connection;
}

public void closeConnection() {
	try {
		if (connection != null) {
			connection.close();
		}
	} catch (SQLException sqle) {sqle.printStackTrace();}
}

public void close() {

}
	
}

