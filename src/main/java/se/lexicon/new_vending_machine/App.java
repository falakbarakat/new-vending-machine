package se.lexicon.new_vending_machine;

import java.util.Scanner;


public class App {
	
	static Scanner sc=new Scanner(System.in);
	  
	public static void main(String[] args) {
		
		VendingMachine vm = new VendingMachine(0);
		Food_child fo=new Food_child();
		Drinks_child dr=new Drinks_child();
		
		System.out.println("input money");
		vm.setPool(vm.getPool()+getRealDimentions());
		boolean running =true;
		boolean b=true;
		
		while ( running) {
			
			if (vm.getPool()>=15&&b) {
				System.out.println("pool: " + vm.getPool() + "kr\nwelcome in our market" +"  "+ "choose somthing!"
						+ "1 for food" +" "+"2 for drinks");
				int choice = sc.nextInt();
				switch (choice) {

				case 1:
					int price = fo.choose_food(0);
					b=vm.buy(price);
					break;
				case 2:
					int price2 = dr.choose_drinks(0);
					b=vm.buy(price2);
					break;
				default:
					System.out.println("not valid nomber,sorry");
					break;
				}
			}else {
				System.out.println("input more moneny");
				vm.setPool(vm.getPool() + getRealDimentions());
				b=true;
			}
			
			System.out.println("Do You Want To Buy Again ? (Y/N)");
			String answer = Buy_more.GetbuyAgainsAnswer().toUpperCase();
			vm.setPool(vm.getPool());
			running = Buy_more.buyAgain(answer);
			
		}

	}
	
	public static int getRealDimentions() {
		boolean not_real=true;
		while(not_real) {
			int input=sc.nextInt();
			if(input==0||input==1||input==5||input==10||input==20||input==50||input==100||input==500||input==1000) {
				return input;
			}else {
				System.out.println("not vaild");
			}
			
		}
				return 0;
	}
		    
}




	


