
public class CallByValueandRef {
	
	
	public void callByValue(int a) {
		
		System.out.println(a);
		
		a=20;
		
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		
		CallByValueandRef cal=new CallByValueandRef();
		
		int i=10;
		
		cal.callByValue(i);
		
		System.out.println("Main"+i);
		
		
		
	}

}
