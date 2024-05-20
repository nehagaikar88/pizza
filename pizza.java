package PizzaProject;

public class pizza {

	private int price;
	private Boolean veg;
	private int extracheeseprice = 100;
	private int  extratoppingsprice = 150;
	private int takeawayprice = 50;
	
	public pizza(Boolean veg) {
		this.veg = veg;
	
	if(this.veg){
		this.price=300;
	}
	else {
		this.price = 400;
	}
	
}
	
	public void extracheese() {
		if(this.veg) {
			System.out.println("price of basepizza = "+300);
		}
		else {
			System.out.println("price of basepizza = "+400);
		}
		System.out.println("added extra cheese =100");
		this.price+= extracheeseprice;
	}
	
	
	public void extratoppings() {
		System.out.println("added extra toppings = 150");
		this.price+=extratoppingsprice;
	}
	
	
	public void takeaway() {
		System.out.println("extra charges for takeaway = 50");
		this.price+= takeawayprice;
	}
	
	
	public void bill() {
		System.out.println("your bill is:"+price);
	}
}