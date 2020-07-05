
public class StaticLogic {
	
	public int a=10;
	
	public void method() {
	System.out.println(a);
	}
	
	static {
		
		System.out.println("Selenium");
	}
	
	static {
		
		System.out.println("Apple");
		//System.exit(0);
	}
	
	public static void main(String[] args) {
		
		System.out.println("MainExecution");
		
		StaticLogic s=new StaticLogic();
		
		StaticLogic s1=s;
		
		s1.method();
		
		s.a=20;//Changing the state of the object
		
		s.method();
		s1.method();
		
	}
}
