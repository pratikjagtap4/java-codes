class Parent
{
	int a = 100;
}

class Child extends Parent
{
	int a = 200;
}

class Example31
{
	public static void main(String[] args)
	{
		Parent p = new Child();
		System.out.println(p.a);
	}
}
