package javaday17.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionInterfaceMethods {

	public static void main(String[] args) {
		List<String> a1=new ArrayList();
		
	    a1.add("Alice");
	    a1.add("Ben");
	    a1.add("Chris");
	    
	    String name=a1.get(1);
	   
	   
	   System.out.println(a1.size());
	   System.out.println(a1.isEmpty());
	   a1.clear();
	   System.out.println(a1.size());
	   System.out.println(a1.isEmpty());
	   
	    
//	    HashSet h1=new HashSet();
//	    System.out.println(h1.add("Alice"));   //true
//	    System.out.println(h1.add("Ben"));     //true
//	    System.out.println(h1.add("Chris"));   //true
//	    System.out.println(h1.add(10));	       //true
//	    System.out.println(h1.add(10.5));      //true
//	    System.out.println(h1.add(true));      //true
//	    System.out.println(h1.add('a'));       //true
//	    System.out.println(h1.add("Alice"));   //false
//	    System.out.println(h1.add("Ben"));     //false
//	    System.out.println(h1.add("Chris"));   //false
//	    System.out.println(h1.add(null));						   //true
//	    System.out.println(h1.add(null));						   //false
//	    System.out.println(h1.add(null));					       //false
//	    
//	    System.out.println(h1);

	}

}
