// COMPLETE
//
// "Transfer" threads select a random amount of money in [0, max_amount]
// and transfer it to a random account in the bank.
//
import java.util.Random;

public class Transfer extends Thread{
	public Transfer(Bank bank, int from, int max_amount) {
		bank_ = bank;
		from_ = from;
		max_ = max_amount;
	}
	// COMPLETE
	public void run(){
		Random random = new Random();
		int f = random.nextInt(from_);
		int t = random.nextInt(bank_.getNumberAccounts());
		int max = random.nextInt(max_);
		bank_.transfer(f,t,max);
	}

	private Bank bank_;
	private int from_;
	private int max_;
}
