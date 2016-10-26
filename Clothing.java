public class Clothing extends Item{
	private short size;
	
	public Clothing(String name, String description[], double price, String path, int quantity, short size){
		super(name, description, price, path, quantity);
		this.size=size;
	}
	
	public void setSize(short size){
		this.size=size;
	}
	
	public short getSize(){
		return size;
	}
}