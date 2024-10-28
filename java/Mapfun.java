package adv.java;
import java.util.*;


public class Mapfun {

	public static void main(String[] args) {
		List<Map <String,Integer> >marklist = new ArrayList<>();
		
for (int i=0;i<5;i++) {
	Scanner scan = new Scanner(System.in);
	Map<String,Integer> map = new HashMap<>();
	System.out.println("enter the name and grade");
	map.put(scan.next(),scan.nextInt());
	marklist.add(map);
	}
			
	 
	System.out.println(marklist);
	marklist.remove(1);




		
//System.out.println();
	

}
	}
