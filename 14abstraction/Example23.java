interface BankAccount
{
	void bankAccount();
}

interface Loans
{
	void loans();
}

interface FreeInsuarance
{
	void freeInsuarance();
}

class Customer4 implements BankAccount , Loans , FreeInsuarance
{
	public void bankAccount()
	{
		System.out.println("Current account");
	}

	public void loans()
	{
		System.out.println(" Car loan Process");
	}
	public void freeInsuarance()
	{
		System.out.println(" Free Health insuarance");
	}
}
class Example23
{
	public static void main(String[] args)
	{	
		Customer4 c4 = new Customer4();
		c4.bankAccount();
		c4.loans();
		c4.freeInsuarance();
	}
}
