package Experiment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst = new ArrayList<>();
 lst.add(12);
 lst.add(15);
 lst.add(25);
 lst.add(50);
 lst.add(100);
 
 Iterator<Integer> itr = lst.iterator();
 while(itr.hasNext()){
	 System.out.println(itr.next());
	 }
 lst.remove(3);
 System.out.println("After Remove Method");
 
 Iterator<Integer> itr2 = lst.iterator();
 while (itr2.hasNext()) {
	 System.out.println(itr2.next());
 }
 System.out.println("------------------");
System.out.println(lst.get(0)); 
 }
	}

