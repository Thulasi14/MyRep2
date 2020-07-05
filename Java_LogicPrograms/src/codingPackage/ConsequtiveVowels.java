package codingPackage;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ConsequtiveVowels {
	
	public static void main(String[] args) {
		
		String[] s= {"google","yahoo","gmail","twitter"};
		
		Set<String> se=new LinkedHashSet<String>(Arrays.asList(s));
		
		for(String a:s) {
			
			int i=0;
			
			while(i<a.length()-1){
				
				char x=a.charAt(i);
				
				char y=a.charAt(i+1);
			
				if((x=='a'|| x=='e'|| x=='i'|| x=='o'|| x=='u') && (y=='a'|| y=='e'|| y=='i'|| y=='o'|| y=='u')) {
							
								se.remove(a);
				}
				
				i++;	
			}						
		}
		System.out.println(se);
	}
}
