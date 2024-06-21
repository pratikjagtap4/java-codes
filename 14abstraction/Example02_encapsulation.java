class Emp
{
	private int empId;
	private String empName;

	Emp(int empId , String empName)
	{
		this.empId = empId;
		this.empName = empName;
	}
	int getEmpId()
	{
		return empId;
	}
	String getEmpName()
	{
		return empName;
	}
}
class Example02_encapsulation
{
	public static void main(String[] args)
	{
		Emp e1 = new Emp(101 , "Pratik");
		int id = e1.getEmpId();
		String name = e1.getEmpName();

		System.out.println(id + " " + name);
	}	
}