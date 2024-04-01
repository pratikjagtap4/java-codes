class HDFC
{
	int accBal;
	HDFC(int accBal)
	{
		System.out.println("welcome hdfc bank , your account is getting started");
		this.accBal = accBal;
	}

	void getBalance()
	{
		System.out.println("your account balance is" + accBal);
	}

	void transferMoney(int transferMoney)
	{
		if(transferMoney <= accBal)
		{
			System.out.println( transferMoney + "is transfer succesfully");
			accBal = accBal - transferMoney ;
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}
}

class Example09
{
	public static void main(String[] args)
	{
		HDFC cust1 = new HDFC(5000);

		cust1.getBalance();
		cust1.transferMoney(3000);
		cust1.getBalance();
	}
}