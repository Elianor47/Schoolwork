import java.awt.*;

public abstract class Item{
	private String name, description[];
	private double price;
	private int quantity;
	private ImageIcon image;
	
	public Item(String name, String description[], double price, String path, int quantity){
		this.name=name;
		this.description=description;
		this.price=price;
		this.quantity=quantity;
		image = new ImageIcon(path);
	}
	
	public abstract String getName(){
		return name;
	}
	
	public abstract void setName(String name){
		this.name=name;
	}
	
	public abstract String[] getDescription(){
		return description;
	}
	
	public abstract void setDescription(String[] description){
		this.description=description;
	}
	
	public abstract void setPrice(double price){
		this.price=price;
	}
	
	public abstract double getPrice(){
		return price;
	}
	
	public abstract void setPrice(int quantity){
		this.quantity=quantity;
	}
	
	public abstract int getQuantity(){
		return quantity;
	}
	
	public abstract void setImage(String path){
		image = new ImageIcon(path);
	}
	
	public abstract ImageIcon getImage(){
		return image;
	}
}