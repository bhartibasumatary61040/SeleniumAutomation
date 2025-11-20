package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
@Test
public void regular() {
		
	ArrayList<String> names = new ArrayList<String>();
	names.add("Bharti");
	names.add("Don");
	names.add("Alekhya");
	
	names.add("Adam");
	names.add("Ram");
	int count = 0;	names.add("Don");
	for(int i =0; i<names.size(); i++) {
		 String actual =names.get(i);
		 if(actual.startsWith("A")) {
			 count++;
		 }
	}
    System.out.println(count);
	}
   @Test
     public void StreamFilter()

   {
	
	ArrayList<String> names = new ArrayList<String>();
	names.add("Bharti");
	names.add("Don");
	names.add("Abhhlekhya");
	
	names.add("Akjkdam");
	names.add("Raaaam");
	//There is no life for intermediate op if there is no terminal op
	//terminal operation will execute only if inter op filter return true 
	// we can create stream
	// how to use filter in stream API
	
	Long c = names.stream().filter(s->s.startsWith("A")).count();
	System.out.println(c);
	
	 Long d = Stream.of("Bharti","Don","Alekhya","Adam","Ram").filter(s->
	 {
	 s.startsWith("A");
	 return false;
	 
	 }).count();
	 System.out.println(d);
	
	//print all the names of ArrayList
	 names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	 names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	 
   }
   @Test
    public void streamMap() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Man");
		names.add("Don");
		names.add("Abhhlekhya");
		
		names.add("Akjkdam");
		names.add("Raaaam");
	   
    	//print names which have last name as a with uppercase
	   
    	Stream.of("Bharti","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
    	.forEach(s->System.out.println(s));
    	
    	//print name which have first latter as a with upper case and sorted
    	
    List<String> names1= Arrays.asList("AzBharti","Don","Alekhya","Adam","Rama");
    names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
    	
    
    Stream<String> newStream =  Stream.concat(names.stream(), names1.stream());
    
   // newStream.sorted().forEach(s->System.out.println(s));
    
  boolean flag =  newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
    System.out.println(flag);
    Assert.assertTrue(flag);
    
    }
   
   @Test
   public void streamCollect() {
	   
	 //list
	   //newList
	 	 List<String> ls = Stream.of("Bharti","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
	 	.collect(Collectors.toList());
	 	 
	 	 System.out.println(ls.get(0));
	 	 
	 	 //
	 	 
	 	 List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
	 	 //print unique number from this array
	 	 //sort the array
	 	 
	 	 values.stream().distinct().forEach(s->System.out.println(s));
	 	List<Integer> Li = values.stream().distinct().sorted().collect(Collectors.toList());
	   System.out.println(Li.get(2));
   }
   
}


