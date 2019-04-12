package se.lexicon.new_vending_machine;

import java.util.Scanner;

public class Cigarattes extends Products {
	public Cigarattes(String name, int price, int Id) {
		super(name, price, Id);

	}

	public Cigarattes() {
		this("a", 0, 0);
	}

	public int choose_cigarrates(int id) {
		int price;
		System.out.println("select somthing to smoke" + " " + "1 for Marlbouro" + " " + "2 for Winston");
		Cigarattes Marlbouro = new Cigarattes("Marlbouro", 70, 1);
		Cigarattes Winston = new Cigarattes("Winston", 50, 2);
		Scanner sc3 = new Scanner(System.in);
		id = sc3.nextInt();
		switch (id) {
		case 1:
			price = Marlbouro.getPrice();
			System.out.println("enjoy smoking ");
			return price;
		case 2:
			price = Winston.getPrice();
			System.out.println("enjoy smoking ");

			return price;
		default:
			System.out.println("not valid nomber");
			return 0;
		}
	}
}
