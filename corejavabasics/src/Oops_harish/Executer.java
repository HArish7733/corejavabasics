package Oops_harish;

public class Executer {
	public static void main(String[]arg) {
		customer cl=new customer();
		cl.setCid(112);
		cl.setCname("harish");
		cl.setAddress("Puducherry");
		System.out.println("Customer id:"+cl.getCid()+"Customer name:"+cl.getCname()+"Customer Address:"+cl.getAddress());
		customer c2=new customer();
		c2.setCid(220);
		c2.setCname("SUNDARI");
		c2.setAddress("BANGALORE");
		System.out.println(c2);
		customer c3=new customer();
		System.out.println(c3);
		customer c4=new customer(221,"valarmathi","chennai");
		System.out.println(c4);
	}
}