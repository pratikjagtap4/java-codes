class grandparent
{
	int a = 10;
	void m1()
	{
		System.out.println("inside m1 method");
	}
}

class parent extends grandparent
{
	int b = 20;
	void m2()
	{
		System.out.println("inside m2 mwthod");
	}
}

class child extends parent
{
	int c = 30;
	void m3()
	{
		System.out.println("inside m3 method");
	}
}

class Example04
{
	public static void main(String [] args)
	{
		grandparent g = new grandparent();
		System.out.println( g.a );
		g.m1();
		//g.m2();
		//g.m3();

		parent p = new parent();
		System.out.println( p.a + "," + p.b );
		p.m1();
		p.m2();
		//p.m3();

		child ch = new child();
		System.out.println( ch.a + "," + ch.b + "," + ch.c );
		ch.m1();
		ch.m2();
		ch.m3();
	}
}