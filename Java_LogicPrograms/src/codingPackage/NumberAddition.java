package codingPackage;

public class NumberAddition {

	
	public static void main(String[] args) {
		
		String s="qw12ki12";
		
		int sum=0;
		
		char[] ch = s.toCharArray();
		
		char[] a = new char[s.length()];
		
		char c='\0';
		
			
			for(int i=0;i<ch.length;i++) {
				
				if(Character.isDigit(ch[i])) {
					
					a[i]=ch[i];
		
				}
				
				else {
					
					a[i]=c;
				}
			}
			
			
			String b="";
			
			for(int j=0;j<ch.length;j++) {
				
				b=b+a[j];
			}
			
			
			//System.out.println(b);
			
			String[] st = b.split("\t");
			
			for(int k=0;k<st.length;k++) {
				
				System.out.println(st[k]);
				
				//sum=sum+Integer.parseInt(st[k]);
			
			}
			
			
	}
}
