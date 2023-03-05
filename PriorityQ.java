package Experiment;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<String> Pque = new PriorityQueue();
Pque.add("Harshal");
Pque.add("123ajay");
Pque.add("Akash");
Pque.add("12");
Pque.add("abc");
Pque.add("Dipika");
Pque.add("AAAA");
Pque.add(":");
	
	Iterator<String> itr = Pque.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
	

}
