package assignmentofday01;

public class TShirt {
	String color;
	String material;
	String design;
			
TShirt (String color, String material, String design){
		this.color=color;
		this.material=material;
		this.design=design;
		}
public void small() {
System.out.println("Tshirt of size small "+color+"\t"+material+"\t"+design);
 }
public void large() {
System.out.println("Tshirt of size Large "+color+"\t"+material+"\t"+design);
}
public void x_large() {
System.out.println("TShirt of size xtra-Large "+color+"\t"+material+"\t"+design);
}
			
public static void main(String[] args) {
			
				TShirt Small =new TShirt("red","Fabilano","plane");
				TShirt large =new TShirt("black","Embroidery","shaded");
				TShirt x_large =new TShirt("purple","Roadster","printed");
				
				Small.small();
				large.large();
				x_large.x_large();
			}

		}	

