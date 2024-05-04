class Parent 
{
	protected void m1()
	{
		System.out.println("parent protected method");
	}
}

class Child extends Parent
{
	public void m1()
	{
		System.out.println("child protected method");
	}
}

class Example34
{
	public static void main(String[] args)
	{
		Parent p = new Child();
		p.m1();
	}
}