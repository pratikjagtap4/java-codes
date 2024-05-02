class Parent 
{
	void carkeys()
	{
		System.out.println("parent carkeys");
	}
}

class Child extends Parent
{
	void bikekeys()
	{
		System.out.println("child bikekeys");
	}
}

class Example27
{
	public static void main(String[] args)
	{
		Parent p = new Child();

		p.carkeys();
	}
}
