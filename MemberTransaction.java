public class MemberTransaction implements Transaction{
	private double subTotal, grandTotal, tax, discount;
	private Member customer;
	private ArrayList<Item> cart;
	
	public MemberTransaction(Member customer, ArrayList<Item> cart){
		this.customer=customer;
		this.cart=cart;
	}
	
	public void removeFromInve(){
		
	}

	public double getGrandTotal(){
		
	}
	
	public Member getCustomer(){
		return customer;
	}
	
	public void setCustomer(Member customer){
		this.customer=customer;
	}
	
	public ArrayList<Item> getCart(){
		return cart;
	}
}