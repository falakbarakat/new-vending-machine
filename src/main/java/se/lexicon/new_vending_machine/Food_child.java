package se.lexicon.new_vending_machine;

import java.util.Scanner;

public class Food_child extends Products{
	
 public Food_child(String name,int price,int Id) {
	  super(name, price, Id);
    
 }  
   public Food_child() {
	  this("a",0,0);
  }
  public int choose_food(int id) {
	  int price;
	  	  System.out.println("select somthing to eat"+" "+ "1 for falafel"+" "+"2 for chawerma" );
	      Food_child falafel=new Food_child("falafel",30,1);
	      Food_child chawerma=new Food_child("chawerma",40,2);
	      Scanner sc3=new Scanner(System.in);
	      id=sc3.nextInt();
	      switch (id) {
	      case 1:
	    	 price=falafel.getPrice();
	    	  return price;
	      case 2:
	    	  price=chawerma.getPrice();
	    	  return price;
	    	  default:
	    		  System.out.println("not valid nomber");
                  return 0;
	      }
	 }
}
	
 
 

