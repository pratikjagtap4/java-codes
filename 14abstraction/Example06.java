abstract class Parent 
{
	abstract void m1();

	void m2()
	{
		System.out.println(" complete m2 method");
	}

	void m3()
	{
		System.out.println(" complete m3 method");
	}
}

class Child extends Parent
{
	void m1()
	{
		System.out.println("complete m1 method in child class");
	}
	
}

class Example06
{
	public static void main(String[] args)
	{
		Child c = new Child();
		c.m1();
		c.m2();
		c.m3();
		System.out.println("------------------");

		Parent p = new Child();
		p.m1();
		p.m2();
		p.m3();
		

	}
}