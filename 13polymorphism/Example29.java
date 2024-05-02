class Parent 
{
	void homekeys()
	{
		System.out.println("parent homekeys");
	}
}

class Child extends Parent
{
	void homekeys()
	{
		System.out.println("child homekeys");
	}
}

class Example29
{
	public static void main(String[] args)
	{
		Parent p = new Child();
		p.homekeys();
	}
}