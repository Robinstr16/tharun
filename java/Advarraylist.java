package adv.java;
import java.util.*;
public class Advarraylist {

	public static void main(String[] args) {
		
		List<String>arraylist = new ArrayList<>(Arrays.asList("Tobey","Magurie"));
		arraylist.add(" is a Spider");
		System.out.println(arraylist);
		List<String>arraylist1 = new ArrayList<>(Arrays.asList("Im a"));
		arraylist1.add("Bat Man");
	    System.out.println(arraylist1);
		arraylist1.clear();
		System.out.println(arraylist1);
		//Lambo
	//	arraylist.forEach(s->System.out.println(s));
	
 arraylist.forEach(System.out::println); 
	}

}





