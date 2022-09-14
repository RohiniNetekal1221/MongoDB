package MyOwnAutoShopProject;

public class MyOwnAutoShop {
	public static void main(String[] args) {
		
		Sedan s=new Sedan(120,5000,"red");
		Ford f = new Ford(110,650000,"grey",50);
		Ford f1 = new Ford(100,500000,"white",10);
		Car c=new Car(60, 20000, "blue");
		
		System.out.println("Sale Price of sedan Car\t"+s.getSalePrice());
		System.out.println("Sale Price of ford car1\t"+f.getSalePrice());
		System.out.println("Sale Price of ford car2\t"+f1.getSalePrice());
	}

}

