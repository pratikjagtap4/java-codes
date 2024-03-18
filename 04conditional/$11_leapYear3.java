class $11_leapYear3
{
	public static void main(String[] args)
	{
		int year = 2100;

		if((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0)))
		{
			System.out.println("Yera is leap year");
		}
		else {
			System.out.println("year is not leap year");
		}
	}
}