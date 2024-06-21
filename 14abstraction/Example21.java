interface BankAccount
{
	void bankAccount();
}

interface Loans extends BankAccount
{
	void loans();
}

class Customer1 implements BankAccount
{
	public void bankAccount()
	{
		System.out.println("savings bank account");
	}
}

class Customer2 implements Loans
{
	public void loans()
	{
		System.out.println("Loan Process");
	}

	public void bankAccount()
	{
		System.out.println("Current account");
	}
}
class Example21
{
	public static void main(String[] args)
	{

		Customer1 c1 = new Customer1();
		c1.bankAccount();

		Customer2 c2 = new Customer2();
		c2.loans();
		c2.bankAccount();
	}
}
