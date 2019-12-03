public class BankTest {
	public static final int N_ACCOUNTS = 5;
	public static final int INIT_BALANCE = 1000;


	public static void main(String args[]) {

		// COMPLETE
		Transfer transfer = new Transfer(new Bank(N_ACCOUNTS, INIT_BALANCE), N_ACCOUNTS, INIT_BALANCE);

		while(true){
			transfer.run();
		}
	}
}
