interface BankAccount
{
	void bankAccount();
}

interface Loans
{
	void loans();
}

class Kyc 
{
	void idProof()
	{
		System.out.println("complete Kyc");
	}
}

class Customer extends Kyc implements BankAccount , Loans
{
	public void bankAccount()
	{
		System.out.println("Current account");
	}

	public void loans()
	{
		System.out.println(" Car loan Process");
	}
}
class Example24
{
	public static void main(String[] args)
	{
		Customer obj = new Customer();
		obj.idProof();
		obj.bankAccount();
		obj.loans();
	}
}