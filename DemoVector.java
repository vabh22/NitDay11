//vector with enumeration listIteration 
package test1;
import java.util.*;

public class DemoVector {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();//organized element in sequence and which is synchronized class.
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		v.addElement(5);
		v.addElement(6);
		v.addElement(7);
		v.addElement(8);
		v.addElement(9);
		System.out.println("==Using toString===");
		System.out.println("capacity:"+v.capacity());
		System.out.println("size:"+v.size());
		System.out.println(v.toString());//show all element using toString()
		v.addElement(10);
		System.out.println("capacity:"+v.capacity());
		System.out.println("Size:"+v.size());
		System.out.println(v.toString());
		v.addElement(11);//it will increase own capacity..........
		System.out.println("capacity:"+v.capacity());
		System.out.println("size:"+v.size());
		System.out.println(v.toString());
		System.out.println("====Display using Enumaration==");
		//enumaration retrive element in vector in forward direction
		Enumeration<Integer>e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement()+" ");
		}
		System.out.println("===Display using ListIterator()===");
		ListIterator<Integer> l1= v.listIterator();//ListIterator retrive element both forward and backward direction;
		System.out.println("===Forward Direction===");
		while(l1.hasNext()) {
			System.out.print(l1.next()+" ");
		}
		System.out.println("\n ==Backward Direct===");
		while(l1.hasPrevious()) {
			System.out.print(l1.previous()+" ");
			
			
		}
		

	}

}
