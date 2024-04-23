class parent
{
	void m1()
	{
		System.out.println("m1 - parent");
	}
}

class child extends parent
{
	void m1(int a)
	{
		System.out.println("m1 - child");
	}
}

class Example04
{
	public static void main(String[] args)
	{
		child obj = new child();
		obj.m1();
	}
}