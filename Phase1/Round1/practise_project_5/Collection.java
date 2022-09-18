package assistedprojects;

//implementation of collections 
import java.util.*;
public class Collection {
	public static void main(String[] args) {
		//to create an arraylist
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Chennai");//
	      city.add("Kerala");    	   
	      System.out.println(city);  
		
		//to create an vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(10); 
	      vec.addElement(20); 
	      System.out.println(vec);
		
		//to create an  linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Kalvi");  
	      names.add("Adhitya");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(7);  
	       set.add(56);  
	       set.add(5);
	       set.add(67);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(43);  
	       set2.add(17);  
	       set2.add(90);
	       set2.add(7);	       
	       System.out.println(set2);
	      	} 
	}
}


