class SumStringDigit
{
	public static void main(String[] args)
	{
		String str = "abc123def456";
		int sum = 0;
		char character;
		for(int i = 0 ; i <str.length(); i++)
		{
			character = str.charAt(i);
			if(num>=0 && num<=9)
			{
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}
}