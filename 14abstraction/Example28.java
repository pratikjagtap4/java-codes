interface Hsbc
{
	void banking();
	void insuarance();
	void finance();
}

class HsbcImple implements Hsbc
{
	public void banking()
	{
	}
	public void insuarance()
	{
	}
	public void finance()
	{
	}
}

class HsbcBanking extends HsbcImple
{
	public void banking()
	{
		System.out.println("Banking requirements");
	}
}

class HsbcInsuarance extends HsbcImple
{
	public void insuarance()
	{
		System.out.println("insuarance requirements");
	}
}

class HsbcFinance extends HsbcImple
{
	public void finance()
	{
		System.out.println("Finance requirements");
	}
}

class Example28
{
	public static void main(String[] args)
	{
		HsbcBanking c1 =  new HsbcBanking();
		c1.banking();
		
		HsbcInsuarance c2 = new HsbcInsuarance();
		c2.insuarance();

		HsbcFinance c3 = new HsbcFinance();
		c3.finance();
	}
}