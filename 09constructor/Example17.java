class Example17
{
	int a ; 
	Example17()
	{
		System.out.println("inside 0 args");
		this.a = 10;
	}
	void m1()
	{
		this(); // must be called within constructors only
	}
	
	public static void main(String[] args)
	{
		Example17 obj = new Example17();
	}
}
