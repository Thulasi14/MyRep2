package codingPackage;

import java.util.*;

public class Routh {
	
	public static void main(String[] args) {
		
String s1="Fillif";
		
		String s=s1.toLowerCase();
		
		char[] ch=s.toCharArray();
		
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		
		for(Character c:ch){
			if(!m.containsKey(c)){
				m.put(c, 1);
			}
			
			else{
				m.put(c, m.get(c)+1);
			}
		}
		
		System.out.println(m);
	}

}
