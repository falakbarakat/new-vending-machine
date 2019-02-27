package se.lexicon.new_vending_machine;

public class VendingMachine {
	private int pool;
		public boolean buy (int price) {
		if (pool==0||pool<price) {
			   System.out.println("too little money");
			   return false;
		   }
		   else {
			   pool=pool-price;
			   System.out.println("your remains pool "+pool);
			   return true;
		   }
	}

	public VendingMachine(int pool) {
		this.pool = pool;
	}

	public int getPool() {
		return pool;
	}

	public void setPool(int pool) {
		this.pool = pool;
	}
	
}
