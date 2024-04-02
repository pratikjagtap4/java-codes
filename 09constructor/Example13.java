class student
{
	int studId ;
	String studName;
	String studType;
	static String trainerName = "ritesh";

	student(int studId , String studName , String studType )
	{
		this.studId = studId;
		this.studName = studName;
		this.studType = studType;
	}
	
	void getStudentInfo()
	{
		System.out.println( studId + " | " + studName + " | " + studType + " | " + trainerName);
	}

}

class Example13
{
	public static void main(String[] args)
	{
		student stud1 = new student(101 , "pratik" , "fresher" );
		student stud2 = new student(102 , "swapnil", "experince" );

		stud1.getStudentInfo();
		stud2.getStudentInfo();
	}

}