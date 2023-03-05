package Experiment;

import java.util.Iterator;
import java.util.Stack;

import javax.swing.plaf.synth.SynthStyleFactory;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<String> stk = new Stack<>();
stk.push("Shubham sir");
stk.push("Urooj");
stk.push("Harshal");
stk.push("Rameshwar");
stk.push("Nilesh");
stk.push("All dear FusionMate");
//System.out.println(stk.pop());
//System.out.println(stk.pop());
//System.out.println(stk.pop());
Iterator<String> itr =stk.iterator();
while(itr.hasNext())
	System.out.println(itr.next());
}
	}
