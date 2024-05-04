class Parent 
{
	public void m1()
	{
		System.out.println("parent public method");
	}
}

class Child extends Parent
{
	protected void m1()
	{
		System.out.println("child protected methof");
	}
}

class Example35
{
	public static void main(String[] args)
	{
		Parent p = new Child();
		p.m1();
	}
}

