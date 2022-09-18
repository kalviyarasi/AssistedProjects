package round2_assisted_pro;

//exception handling when insufficient balance in account
public class ExceptionHandling {
	public static void main(String[] args) throws InvalidTransaction {
		FindBalance obj=new FindBalance();
		obj.balance(1100, 1000);
		
	}

}

class FindBalance{
	void balance(int amount,int balance) throws InvalidTransaction {
		try {
			if(balance>amount) {
				System.out.println("your transaction is successful");
				System.out.println("your remaining balance after money withdrawal ="+(balance-amount));
			}
			else
			{
				throw new InvalidTransaction("sorry....your balance is insufficient to continue request");
			}
		}
		finally {
			System.out.println("Thanks for using our service");
		}
		
	
}
}

class InvalidTransaction extends Exception{
	InvalidTransaction(String a) {
		super(a);
	}
}