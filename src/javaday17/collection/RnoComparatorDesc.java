package javaday17.collection;

import java.util.Comparator;

public class RnoComparatorDesc implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getRno()>s2.getRno())
			return -1;
		else if(s1.getRno()<s2.getRno())
			return 1;
		else
			return 0;
	}

}
