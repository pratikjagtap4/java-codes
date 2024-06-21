interface Hsbc
{
	void banking();
	void insuarance();
	void finance();
}

abstract class Banking implements Hsbc
{
	public void banking()
	{
		System.out.println("Banking requirements");
	}
}

abstract class Insuarance extends Banking
{
	public void insuarance()
	{
		System.out.println("Insuarance requirements");
	}
}

class Finance extends Insuarance
{
	public void finance()
	{
		System.out.println("finance requirements");
	}
}

class Example18 extends Finance
{
	public static void main(String[] args)
	{
		Finance cust1 = new Finance();
		cust1.banking();
		cust1.insuarance();
		cust1.finance();
	}
}