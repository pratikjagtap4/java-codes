class Parent
{
	void homekeys()
	{
		System.out.println("parent homekeys");
	}
}

class Child extends Parent
{
	
}
class Example28
{
	public static void main(String[] args)
	{
		Parent p = new Child();

		p.homekeys();
	}
}