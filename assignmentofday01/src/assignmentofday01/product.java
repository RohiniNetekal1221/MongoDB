package assignmentofday01;

public class product {
  int ProId;
  String ProName;
  double ProPrice;

  private int ProID;


	public double ProPrice(double ProPrice ) {
		double p= ProPrice *+ ProPrice;
		return p;
				
	}

	public static void main(String[] args) {

		product p =new product();
		p.ProID=110;
		p.ProName="Bag";
		System.out.println(p.ProID);
		System.out.println(p.ProName);
		System.out.println("Gst \t"+p.ProPrice(10));
	}


}

//Create a product class The properties are ProID, ProName, ProPrice 
//display the information and ProPrice will be added additional tax of GST .