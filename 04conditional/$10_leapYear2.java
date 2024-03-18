class $10_leapYear2
{
	public static void main(String[] args)
	{
		int year = 2000;

		if(year %400 ==0)
		{
			System.out.println("Year is leap year");
		}
		else if(year % 100== 0)
		{
			System.out.println("Year is not a leap year");
		}
		else if( year%4==0)
		{
			System.out.println("year is leap year");
		}
		else{
			System.out.println("year is not leap year");
		}
	}
}
