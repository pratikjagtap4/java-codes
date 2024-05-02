class Parent 
{
	int a = 100;
	void m1()
	{
		System.out.println("parent method" + this.a);
	}
}

class Child extends Parent
{
	float b = 200.5f;
	void m2()
	{
		System.out.println("child method" + this.b + " " + this.a);
	}
}

class Cyber 
{
	static void test(Parent p)
	{
		p.m1();
	}
}

class Example26
{
	public static void main(String[] args)
	{
		Cyber.test(new Child());
	}
}