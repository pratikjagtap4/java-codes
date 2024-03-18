class $13_nestedFor4
{
	public static void main(String[] args)
	{
		char count = 97;

		for(int i = 1; i<= 3 ;i++)
		{
			for(int j =1; j <=i; j++)
			{
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
	}
}