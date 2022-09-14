package com.sonata.DAOImpl1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.sonata.Intf1.ProductIntf;
import com.sonata.product.product;

public class Productimpl implements ProductIntf {
	DBConnection db = new DBConnection();
	PreparedStatement ps = null;
	int status = 0;
	@Override
	public int addProduct(Object object) {
		product p = (product) object;
		
		try {
			ps = db.getConnection().prepareStatement("INSERT INTO product VALUES(?,?,?)");
			ps.setInt(1, p.getProductID());
			ps.setString(2, p.getProductName());
			ps.setDouble(3, p.getProductPrice());
			status = ps.executeUpdate();
			db.closeConnection();
		} catch (SQLException e) {e.printStackTrace();}
		  finally {closeStatement();}
		System.out.print("Record added ");
		return status;
	}
	@Override
	public int deleteproduct(Object object) {
		product p = (product) object;
		
		try {
			ps = db.getConnection().prepareStatement("DELETE FROM product WHERE productID = ?");
			ps.setInt(1, p.getProductID());
			status = ps.executeUpdate();
			db.closeConnection();
		} catch (SQLException e) {e.printStackTrace();}
		  finally {closeStatement();}
		System.out.print("Record deleted ");
		return status;
	}
	@Override
	public int updateproduct(Object object) {
		product p = (product) object;
		
		try {
			ps = db.getConnection().prepareStatement("UPDATE product SET productName = ? , productPrice = ? WHERE productID = ?");
			ps.setString(1, p.getProductName());
			ps.setDouble(2, p.getProductPrice());
			ps.setInt(3, p.getProductID());
			status = ps.executeUpdate();
			db.closeConnection();
		} catch (SQLException e) {e.printStackTrace();}
		  finally {closeStatement();}
		System.out.print("Record updated ");
		return status;
	}
	@Override
	public void displayProduct() {
		
		try {
			ps = db.getConnection().prepareStatement("select * from product");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("productID\tproductName\tproductPrice");
				do {
				   System.out.println(rs.getInt("productID") + "\t\t" + rs.getString("productName") + "\t\t" + rs.getDouble("productPrice"));
				} while (rs.next());
			} else {
				System.out.println("No Records Found!!");
			}
			db.closeConnection();
		} catch (SQLException e) {e.printStackTrace();}
		  finally {closeStatement();}
	}
	public void closeStatement() {
		if (ps != null) {
			try { ps.close(); } catch (SQLException e) {e.printStackTrace();}
		}
	}
	@Override
	public int deleteProduct(Object object) {
		
		return 0;
	}
	@Override
	public int updateProduct(Object object) {
	
		return 0;
	}
}