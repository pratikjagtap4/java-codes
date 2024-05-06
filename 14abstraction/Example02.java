abstract class MobileBanking
{
	abstract void transfer();
}

class HdfcServer extends MobileBanking
{
	void transfer()
	{
		System.out.println("transfer - complete method");
	}
}

class Example02
{
	public static void main(String[] args)
	{
		HdfcServer cust = new HdfcServer();
		cust.transfer();
	}
}