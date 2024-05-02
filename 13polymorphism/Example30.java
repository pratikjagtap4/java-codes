class Parent
{
	static void homekeys()
	{
		System.out.println("parent key");
	}
}
class Child extends Parent 
{
	static void homekeys()
	{
		System.out.println("Child Key");
	}
}

class Example30
{
	public static void main(String[] args)
	{	
		Parent p = new Child();
		p.homekeys();
	}
}