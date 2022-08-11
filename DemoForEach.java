package test1;
import java.util.*;

public class DemoForEach {

	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<Integer>();
		a1.add(12);
		a1.add(45);
		a1.add(90);
		a1.add(78);
		
		System.out.println("===Display Using foreach() with lembdaExpression=====");
		a1.forEach((z)-> // lambda expression using lambda expression loading time of execution process is saved and generate highperformance of application
		{
			System.out.println(z.toString()+"");
			
		});
		

	}

}
