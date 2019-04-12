package se.lexicon.new_vending_machine;

public class Products {
	String name;
	int price;
	int id;

	public Products(String name, int price, int id) {
		this.name = name;
		this.price = price;
		this.id = id;
	}
		
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
