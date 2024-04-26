class Hdfc
{
	Hdfc(String name , String IdProof)
	{
		System.out.println("saving account");
	}
	Hdfc(String name , String IdProof , String BusinessName)
	{
		System.out.println("credit account");
	}
}

class Example10
{
	public static void main(String[] args)
	{
		Hdfc obj = new Hdfc("pratik" , "123abc");
		Hdfc obj2 = new Hdfc("Swapnil" , "456xyz" , "vasuEnterprises");

	}
}