package javaday17.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class AddAllDemo {

	public static void main(String[] args) {
		List<String> state;
		state=new ArrayList();
		state.add("Pune");
		state.add("Mumbai");
		state.add("Nagpur");   //[Pune, Mumbai, Nagpur]
		
		
		List<List<String>> India=new ArrayList();
		India.add(state);
		
		state=new ArrayList();
		state.add("Jaipur");
		state.add("Bikaner");
		state.add("Fatehpur");	//[Jaipur, Bikaner, Fatehpur]
		
		India.add(state);
		System.out.println(India);//[[Pune, Mumbai, Nagpur],[Jaipur, Bikaner, Fatehpur]]
		
		//System.out.println(India.get(1));
		
		for(int i=0;i<India.size();i++)
		{
			System.out.println(India.get(i).get(0));
		}
	}

}
