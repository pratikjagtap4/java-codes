class Parent
{
	private void m1()
	{
		System.out.println("parent m1");
	}
}

class Child extends Parent
{
	void m1()
	{
		System.out.println("child m1");
	}
}

class Example32
{
	public static void main(String[] args)
	{
		Parent p = new Child();
		p.m1();
		}
}