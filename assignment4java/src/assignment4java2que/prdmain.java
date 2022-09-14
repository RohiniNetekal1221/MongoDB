package assignment4java2que;

import java.util.List;
public class prdmain {
	public List<product>sortprice()throws productexception{
		List<product> prd =new productlist().addproducts();
		prd.sort((product p1,product p2)->p1.getPrdPrice()-p2.getPrdPrice());
		return prd;
	}
	public static void myException(product p1)throws productexception {
	
		if(p1.prdPrice<0)
			throw new productexception("Price cannot be n negative");
		else
			System.out.println("Price is");
		
	}
		public static void main(String args[])throws productexception {
			System.out.println(new prdmain().sortprice());
			
		}
}
