	

package com.sonata.product;

import com.sonata.DAOImpl1.Productimpl;

public class Apps{
		public static void main(String[] args) {
			product p1 = new product();
			product p2 = new product();
			product p3 = new product();
			product p4 = new product();
		
			p1.setProductID(1);
			p1.setProductName("Door");
			p1.setProductPrice(5000.00);
			
			p2.setProductID(2);
			p2.setProductName("Chair");
			p2.setProductPrice(250.00);
			
			p3.setProductID(3);
			p3.setProductName("Box");
			p3.setProductPrice(210.00);
			
			p4.setProductID(p2.getProductID());
			p4.setProductName("Table");
			p4.setProductPrice(550.00);
			
			Productimpl pImpl = new Productimpl();
			
		
			System.out.println(pImpl.addProduct(p1));
			System.out.println(pImpl.addProduct(p2));
			System.out.println(pImpl.addProduct(p3));
			pImpl.displayProduct();
			System.out.println("\n");
			
			
			System.out.println(pImpl.deleteProduct(p1));
			pImpl.displayProduct();	
			System.out.println("\n");
			
			System.out.println(pImpl.updateProduct(p4));
			pImpl.displayProduct();	
			System.out.println("\n");
		}
    }
		
	