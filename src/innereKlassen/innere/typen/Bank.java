package innereKlassen.innere.typen;


public class Bank {

    private double balance = 1000.0;
    
    
    public void showBalance() {
    	System.out.println(balance);
    }
    
    public class Account{
    	
    	public void deposit(double amount) {
    		Bank.this.balance += amount;
    	}
    	
    }

	public static void main(String[] args) {
		   Bank b = new Bank();
	        Bank.Account acc = b.new Account();
	        acc.deposit(10.0);
	        b.showBalance();
	}

}
