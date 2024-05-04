class Parent 
{
	protected void m1()
	{
		System.out.println("Parent method");
	}
}

class Child extends Parent
{
	protected void m1()
	{
		System.out.println("Child method");
	}
}

class Example33
{
	public static void main(String[] args)
	{
		Parent p = new Child();
		p.m1();
	}
}
			