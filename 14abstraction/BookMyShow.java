class PvrMovies
{
	private static boolean ticketStatus = false;
	private static PvrMovies eticket;
	
	private PvrMovies()
	{
		System.out.println("Welcome to Pvr Movies");
	}

	public static PvrMovies bookTicket()
	{
		if(ticketStatus == false)
		{
			eticket = new PvrMovies();
			ticketStatus = true;
		}
		return eticket;
	}
}
class BookMyShow
{
	public static void main(String[] args)
	{
		PvrMovies mticket = PvrMovies.bookTicket();

		System.out.println(mticket);

		mticket = PvrMovies.bookTicket();
		System.out.println(mticket);
	}
}