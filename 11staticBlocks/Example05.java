class HDFC
{
	int accBal;

	static{
		System.out.println("Connecting to server");
	}


	{
		System.out.println("Logics to connect and KYC verification");
	}


	HDFC(int accBal){
		if(accBal >= 5000)
		{
			System.out.println("your account is getting created");
			this.accBal = accBal;
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}


	void getBal()
	{
		System.out.println("account balance is" + accBal);
	}

	void transferMoney(int amount)
	{
		if(amount <=accBal)
		{
			System.out.println(amount + " transfer successfully" );
			this.accBal = this.accBal - amount;
		}
		else 
		{
			System.out.println("insufficient balance");
		}
	}


}

class Example05
{
	public static void main(String[] args)
	{
		HDFC cust1 = new HDFC(5000);
		cust1.getBal();
		System.out.println("start");
	}
}