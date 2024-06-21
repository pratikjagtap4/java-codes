interface BankAccount
{
	void bankAccount();
}

interface Loans
{
	void loans();
}

interface FreeInsuarance extends BankAccount , Loans
{
	void freeInsuarance();
}

class Customer1 implements BankAccount
{
	public void bankAccount()
	{
		System.out.println("Saving account");
	}
}

class Customer2 implements Loans
{
	public void loans()
	{
		System.out.println(" home loan Process");
	}
}

class Customer3 implements FreeInsuarance
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
class Example22
{
	public static void main(String[] args)
	{
		new Customer1().bankAccount();
		new Customer2().loans();

		Customer3 c3 = new Customer3();
		c3.bankAccount();
		c3.loans();
		c3.freeInsuarance();
	}
}