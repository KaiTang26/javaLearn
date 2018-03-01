package checkedexception;

import java.math.BigDecimal;

public class Client {
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		Account account = bank.registerNewAccount();
		
		account.setAmount(new BigDecimal(30));
		
		account.setAccountNumber(123);
		
		try {
			bank.withdraw(account, new BigDecimal(40));
		} catch (insufficientFundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
		
		bank.deposit(account, new BigDecimal(20));
		
		
		try {
			bank.withdraw(account, new BigDecimal(40));
		} catch (insufficientFundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
		
		
		
	}

}
