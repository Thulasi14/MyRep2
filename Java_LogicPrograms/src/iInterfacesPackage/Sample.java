package iInterfacesPackage;

public interface Sample {
	
	public void apple();
	
	abstract void guva();
	
	default void mango() {
		
		System.out.println("Mango is sour");
	}
	
	static void pineapple() {
		
		System.out.println("Pineapple is sweet");
		
	}

}
