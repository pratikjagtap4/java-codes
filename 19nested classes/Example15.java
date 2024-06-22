class HDFC
{
	void banking()
	{
		class Banking
		{
			float accountBalance = 5728.5f;
		}
		Banking cust1 =  new Banking();
		System.out.println("account balance is " + cust1.accountBalance);
	}

	void insuarance()
	{
		class Insuarance
		{
			int ins_id = 123;
		}
		Insuarance cust1 = new Insuarance();
		System.out.println("insuarance id is " + cust1.ins_id);
	}
}

class Example15
{
	public static void main(String[] args)
	{
		HDFC account = new HDFC();
		account.banking();
		account.insuarance();
	}
}