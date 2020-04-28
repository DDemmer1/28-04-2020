package javaII;

public class Item implements Comparable<Item>{
	
	private String itemName;
	private int amount;
	private float price;
	
	public Item(String itemName, int amount, float price) {
		super();
		this.itemName = itemName;
		this.amount = amount;
		this.price = price;
	}
	
	
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}


	@Override
	public int compareTo(Item otherItem) {
		return (int) (this.getPrice()*100 - otherItem.getPrice()*100);
	}
	
	
	
	
}
