class RBI
{
	void Loans()
	{
		System.out.println("RBI ROI - 7%");
	}
	void processingFee()
	{
		System.out.println("processing fee - 1%");
	}
}

class ICICI extends RBI
{
	void Loans()
	{
		System.out.println("ICICI ROi - 12%");
	}
}

class HDFC extends RBI
{
	void Loans()
	{

		System.out.println("HDFC ROI - 13%");
	}
}

class YES extends RBI
{
	/*void Loans()
	{
		System.out.println("Yes ROI - 14%");
	}*/
}
class customer
{
	public static void main (String[] args)
	{
		RBI cust1 = new ICICI();
		cust1.Loans();
		cust1.processingFee();

		RBI cust2 = new HDFC();
		cust2.Loans();

		RBI cust3 = new YES();
		cust3.Loans();
	}
}