package codingPackage;

import java.util.*;

public class VowelsCountString {
	
	public static void main(String[] args) {
		
		String s="This is my name";
		
		Map<String,Integer> m=new HashMap<String,Integer>();
		
		
		String[] st = s.split(" ");
		
		for(String a:st) {
			
			int count=0;
			
			for(int i=0;i<a.length();i++) {
				
				char c=a.charAt(i);
				
				if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u') {
					
					count++;
					
				}
				
			}
			
			m.put(a, count);
		}
		
		
		System.out.println(m);
	}

}
