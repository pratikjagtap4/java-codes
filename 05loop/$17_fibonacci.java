class $17_fibonacci
{
	public static void main(String[] args)
	{
		int num1 = 0 , num2 = 1 , num3;

		for(int i = 1; i<10; i++)
		{
			num3 = num1 + num2;

			num1 = num2;
			num2 = num3;
		System.out.println(num3);
		}
	}
}