import java.util.Scanner;

public class CashRegisterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double amount = 0;
		double payment2 = 0;
		
		Scanner in = new Scanner(System.in);

		
		CashRegister myCashRegister = new CashRegister();
		
		while(amount != -1)
		{
			System.out.println("Enter a purchase amount, or -1 to stop: ");
			amount = in.nextDouble();
			myCashRegister.recordPurchase(amount);
		}
				
		System.out.println("Enter payment: ");
		payment2 = in.nextDouble();
		myCashRegister.receivePayment(payment2);
		
		System.out.print("Your change is:\t");
		System.out.format("%.2f", myCashRegister.giveChange());
		
	}

}
