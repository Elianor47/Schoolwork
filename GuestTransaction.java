public class GuestTransaction implements Transaction{
	private double subTotal, grandTotal, tax, discount;
	private String name, address;
	private ArrayList<Item> cart;
	
	public GuestTransaction(String name, String address, ArrayList<Item> cart){
		this.name=name;
		this.address=address;
		this.cart=cart;
	}
	
	public void removeFromInve(){
		
	}

	public double getGrandTotal(){
		
	}
	
	public ArrayList<Item> getCart(){
		return cart;
	}
}