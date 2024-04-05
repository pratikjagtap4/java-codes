class HDFC
{
	int accBal;
	{
		System.out.println("Logics to connect and KYC verification");
	}
	HDFC(int accBal)
	{
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

}

class Example07
{
	public static void main(String[] args)
	{
		HDFC cust1 = new HDFC(5000);
		cust1.getBal();
	}
}