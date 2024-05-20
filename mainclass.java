package PizzaProject;

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	pizza p = new pizza(false);
		p. extracheese();
		p.extratoppings();
		p.takeaway();
		p.bill();*/
		
		deluxpizza dp = new deluxpizza(true);
		dp.extracheese();
		dp.extratoppings();
		dp.takeaway();
		dp.bill();
	
	}

} 
