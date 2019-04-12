package se.lexicon.new_vending_machine;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class App {
	static Scanner sc=new Scanner(System.in);
		public static void main(String[] args) {
		LocalDate Date = LocalDate.now();
		LocalTime Time = LocalTime.now();
		VendingMachine vm = new VendingMachine(0);
		Food_child fo=new Food_child();
		Drinks_child dr=new Drinks_child();
		Cigarattes smok=new Cigarattes();
		System.out.println("Welcome To Our Vending Machine");
		System.out.println(" Date of Buying    " + Date + " ");
		System.out.println(" Time of Buying   " + Time + " ");
		System.out.println("input money");
		vm.setPool(vm.getPool()+getRealDimentions());
		boolean running =true;
		boolean success_to_buy=true;
				while ( running) {
			
			     if (vm.getPool()>=15&&success_to_buy) {
				    System.out.println("pool: " + vm.getPool() + "kr\nwelcome in our market" +"  "+ "choose somthing!"
						+ "1 for food" +" "+"2 for drinks"+" "+ "3 for ciggarates");
				     int choice = sc.nextInt();
				switch (choice) {

				case 1:
					int price = fo.choose_food(0);
					success_to_buy=vm.buy(price);
					if(success_to_buy) {
						System.out.println("eat sandwich hot");
					}
					break;
				case 2:
					int price2 = dr.choose_drinks(0);
					success_to_buy=vm.buy(price2);
					if(success_to_buy) {
						System.out.println("drink it cold");
					}
					break;
				case 3:
					int price3 = smok.choose_cigarrates(0);
					success_to_buy=vm.buy(price3);
					if(success_to_buy) {
						System.out.println("enjoy smoking you cigarrates");
					}
					break;
				default:
					System.out.println("not valid nomber,sorry");
					break;
				}
			}else {
				System.out.println("input more moneny");
				vm.setPool(vm.getPool() + getRealDimentions());
				success_to_buy=true;
			}
			System.out.println("Do You Want To Buy more ? (Y/N)");
			String answer = Buy_more.GetbuyAgainsAnswer().toUpperCase();
			vm.setPool(vm.getPool());
			running = Buy_more.buyAgain(answer);
			}
		System.out.println("Your remaining money are :"+" " +vm.getPool()+" kr" + " "+ "100good by");
	}
	
	public static int getRealDimentions() {
		boolean keep_running=true;
		    while(keep_running) {
			int input=sc.nextInt();
			if(input==0||input==1||input==5||input==10||input==20||input==50||input==100||input==200||input==500||input==1000) {
				return input;
			}else {
				System.out.println("not vaild");
			}
		}
		return 0;
	}
 }




	


