package ch06_class.sec02_customer;

public class CustomerArrayMain {

	public static void main(String[] args) {
		Customer[] customers = new Customer[3];
		customers[0] = new Customer(1, "렌야", 27);
		customers[1] = new Customer(2, "슈우", 1);
		customers[2] = new Customer(3, "인아", 32);
		
		Customer[] customers2 = {
				new Customer(1, "렌야", 27), new Customer(2, "슈우", 1) ,
				new Customer(3, "인아", 32) , new Customer(4, "세아", 26)
		};
		
		for (int i = 0; i < customers.length; i++) 
			System.out.println(customers[i]);
		for(Customer customer: customers)
			System.out.println(customer);
	}
}
