class Example07
{
	Example07(int a )
	{
		System.out.println("int arg");
	}
	Example07(float f)
	{
		System.out.println("float arg");
	}
	Example07(char a, boolean b)
	{
		System.out.println("char , boolean arg");
	}
	public static void main(String[] args)
	{
		Example07 obj =  new Example07('a' , true);
	}
}