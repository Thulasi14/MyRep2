import java.util.*;

public class MapQuestions {
	
	public static void main(String[] args) {
		
		List<Integer> li=new ArrayList<Integer>(Arrays.asList(12,9,4,98,6));
		
		//li=new ArrayList<Integer>();
		
		List<Integer> li1=new ArrayList<Integer>();
		
		li.removeAll(li);
	
		System.out.println(li);
	}

}
