package assignment4java2que;
import java.util.LinkedList;
import java.util.List;
public class productlist {
	public List<product>addproducts(){
		List<product> prd=new LinkedList<product>();
		prd.add(new product(101,"Pen",-1));
		prd.add(new product(102,"Pencil",350));
		prd.add(new product (103,"Eraser",550));
		prd.add( new product(104,"writing pad",660));
		prd.add(new product(105,"A4 paper",230));
		return prd;
	}


}
