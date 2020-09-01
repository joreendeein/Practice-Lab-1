import java.util.Map;
import java.util.TreeMap;

public class testdate {

	public static void main(String[] args) {
		Date d1 = new Date(9, 10, 2002);
		Date d2 = new Date(8, 20, 2020);
		Date d3 = new Date(4, 16, 2005);
		Date d4 = new Date(3, 24, 2010);
		
		
	//Problem Number 2
		
		if (d1.compareTo(d2) == 1) {
			System.out.println(d1 + " is latter than " + d2);
		
		}else if (d1.compareTo(d2) == -1 ) {
			System.out.println(d1 + " is earlier than " + d2);
		
		}else {
			System.out.println(d1 + " and " + d2 + " are the same dates...");
			
		}
		
		
	//Problem Number 3
		  
		TreeMap<Date, String> syllabus = new TreeMap(); // use compare to as basis
		syllabus.put(d1, "Charles");
		syllabus.put(d2, "Zia");
		syllabus.put(d3, "Catherine");
		syllabus.put(d4, "Nikka");
		
		 for(Map.Entry<Date, String> topic: syllabus.entrySet()) {
			if(topic.getKey().month == 9 && topic.getKey().year == 2002) {
				System.out.println(topic.getValue());
			}else { 