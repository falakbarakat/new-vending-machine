package se.lexicon.new_vending_machine;

import java.util.Scanner;

public class Drinks_child extends Products {
	public Drinks_child(String name, int price, int id) {
		super(name, price, id);
	}

	public Drinks_child() {
		this("a", 0, 0);
	}

	public int choose_drinks(int id) {
		int price;
		System.out.println("choose something to drink" + "1  you get orange_juice , 2 you get lemon_juice");
		Drinks_child oj = new Drinks_child("orange_juice", 15, 1);
		Drinks_child lj = new Drinks_child("lemon_juice", 20, 2);

		Scanner sc2 = new Scanner(System.in);
		id = sc2.nextInt();
		switch (id) {
		case 1:
			price = oj.getPrice();

			return price;
		case 2:
			price = lj.getPrice();
			return price;
		default:
			System.out.println("not valid nomber");
			return 0;
		}
	}
}
