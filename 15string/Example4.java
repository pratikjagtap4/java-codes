class Example4 // extends Object
{
	int a = 100;
	public String toString()
	{
		return " Example4" + a;
	}

	public static void main(String[] args)
	{
		Example4 obj = new Example4();
		System.out.println(obj.toString());
	}
}

// objects class have toString methods which is overriden in string class