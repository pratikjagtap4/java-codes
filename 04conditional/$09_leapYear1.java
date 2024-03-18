class $09_leapYear1
{
	public static void main(String[] args)
	{
		int year = 2100;

		if(year % 400 == 0)
		{
			System.out.println("Year is leap year");
		}
		else {
			if(year % 100 != 0)
			{
				if( year % 4 == 0)
				{
					System.out.println("Year is leap year");
				}
				else {
					System.out.println("year is not leap year");
				}
			}
			else {
				System.out.println("year ise not leap year");
			}
		}
	}
}