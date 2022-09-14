package MyOwnAutoShopProject;

public class Truck extends Car {
	int weight;
	
	Truck(int speed,double regularPrice,String color,int weight){
		super(speed,regularPrice,color);
		this.weight=weight;
	}
	
	public double  getSalePrice(int weight) {
		
		if(weight>2000) 
			return 0.1*100;
		
			else
				
			return 0.2*200;
		
	}
}