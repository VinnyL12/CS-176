
public class CashRegister 
{
	private double purchase;
	private double payment;
		
public CashRegister()
{
	purchase = 0;
	payment = 0;
}

public void recordPurchase(double cost)
{
	purchase = purchase + cost;
}

public void receivePayment(double paymentReceived)
{
	payment = payment + paymentReceived;
}

public double giveChange()
{
	double change;
	change = payment - purchase - 1;
	
	purchase = 0;
	payment = 0;
	
	return change;
}
	
	
	
}
