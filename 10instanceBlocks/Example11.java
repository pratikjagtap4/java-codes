class child
{
	//int a;
	{
		System.out.println("child");
		//this.a = 10;
	}
}
class Example11
{
	static Example11 obj = new Example11();
	{
		System.out.println("parent");
	}
	public static void main(String[] args)
	{
		System.out.println("start");
		child obj1 = new child();
		//System.out.println(obj1.a);
		
	}
}