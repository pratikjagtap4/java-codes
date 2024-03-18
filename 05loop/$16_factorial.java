class $16_factorial
{
	public static void main(String [] args)
	{
		int num = 7 , fac =1;

		for (int i = 1; i<= num ; i++)
		{
			fac = fac*i;
		}

		System.out.println("factorial of " + num + " is " + fac);
	}
}