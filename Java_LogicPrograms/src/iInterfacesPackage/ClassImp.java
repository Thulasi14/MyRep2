package iInterfacesPackage;

public class ClassImp implements Sample {

	
	public void apple() {
		
		System.out.println("Apple is sweet");
	}

	
	public void guva() {
		
		System.out.println("Guva is sweet and tangy");
		
	}
	
	public static void main(String[] args) {
		
		ClassImp c=new ClassImp();
		
		c.apple();
		c.guva();
		c.mango();
		Sample.pineapple();
		
	}
	

}
