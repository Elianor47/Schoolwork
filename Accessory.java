public class Accessory extends Item{
	private String material;
	
	public Accessory(String name, String description[], double price, String path, int quantity, String material){
		super(name, description, price, path, quantity);
		this.material=material;
	}
	
	public void setMaterial(String material){
		this.material=material;
	}
	
	public short getMaterial(){
		return material;
	}
}
