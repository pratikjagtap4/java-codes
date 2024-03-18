class $14_practiseFor1
{
	public static void main(String[] args)
	{
		int num = 17, m = num / 2 , flag = 0 ;

		for(int i = 2 ; i <= m ; i++)
		{
			if (num / i == 0)
			{
				flag = 1;
			}
		}
		if(flag == 1)
		{
			System.out.println(num + " is not prime number ");
		}
		else 
		{
			System.out.println(num + " is prime number");
		}
	}
}