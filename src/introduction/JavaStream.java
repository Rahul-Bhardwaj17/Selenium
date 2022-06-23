package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream {
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("John");
		arr.add("Adam");
		arr.add("Shaifali");
		arr.add("Sanyukta");
		arr.add("Rahul");
		
		// return the counts which start with 'S'
		
		long names = arr.stream().filter(s->s.startsWith("R")).count();
		System.out.println(names);
		
		//alternate way to cream the arraylist using strem are mentioned below
	
		Long d=Stream.of("Aarushi","Ankit","Shubham","Sachin").filter(s->s.startsWith("A")).count();
		
		// Print the name length greater than 5
		
		arr.stream().filter(s->s.length()>4).sorted().forEach(s->System.out.println(s));
		arr.stream().filter(s->s.length()>4).limit(2).forEach(s->System.out.println(s));
		arr.stream().filter(s->s.length()>4).map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
		
		List<String> names2 = Arrays.asList("Shalu","Rohit","Lokesh");
		
		Stream<String> newstream = Stream.concat(arr.stream(), names2.stream());
		newstream.forEach(s->System.out.println(s));
		arr.stream().filter(s->s.length()>4).sorted().collect(Collectors.toList()).forEach(s->System.out.println(s));
		
	
	  List<Integer> list2 = Arrays.asList(1,3,3,5,5,7,9);
	  //find out unique no.
	  
	  list2.stream().distinct().forEach(s->System.out.println(s));
	  list2.stream();
		
		
		
		
		
	}

}
