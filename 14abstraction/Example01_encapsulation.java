class Demo
{
	private int a;

	public void  setVar(int a)
	{
		this.a=a;
	}

	public void getVar()
	{
		System.out.println("Value of a is" + this.a);
	}
}

class Example01_encapsulation
{
	public static void main(String[] args)
	{
		Demo d = new Demo();
		d.setVar(200);
		d.getVar();
	}
}