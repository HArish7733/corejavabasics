package corejavabasics_harish;
import java.util.*;
public class SampleJava {

	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner s=new Scanner (System.in);
	int a,b,c,d;
	System.out.println("enter the a and b values:");
	a=s.nextInt();
	b=s.nextInt();
	c=a+b;
	d=a-b;
	System.out.println("Addition of a="+a+"and b="+b+"is:"+c);
	System.out.println("Subraction of a ="+a+"and b="+b+"is:"+d);
	}

}
