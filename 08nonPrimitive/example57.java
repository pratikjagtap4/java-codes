class instituteApp
{
	int studId;
	String studName;
	String studType;
	
	void setStudInfo(int studType , String studName, String studType )
	{
		this.studId = studId;
		this.studName = studName;
		this.studType  = studType;
	}

	static void getStudInfo(instituteApp obj)
	{
		System.out.prinltn("Student id of " + obj.studName + " is " + obj.studId + " and he is " + obj.studType);
	}

}
class example57
{
	public static void main(String [] args)
	{
		instituteApp stud1 = new instituteApp();
		stud1.setStudInfo(101 , "pratik" , "experience");

		instituteApp stud2 = new instituteApp();
		stud2.setStudInfo(102, "swapnil" , "fresher");
	
		instituteApp.getStudInfo(stud1);
		instituteApp.getStudInfo(stud2);

		
	}
}