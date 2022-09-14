package MyOwnAutoShopProject;

public class Sedan extends Car {

	int length;
	Sedan(int speed,double regularPrice,String color){
		super(speed, regularPrice, color);
	}
	public double getSalePrice(int length ) {
		
		if(length > 20)
			
			return super.getSalePrice()-5/100;
		else
			return super.getSalePrice()-10/100;
	}
		
}
