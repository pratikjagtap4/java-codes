import java.io.Serializable;
class Student implements Serializable
{
	int studId;
	String studName;
	Student(int studId , String studName)
	{
		this.studId = studId;
		this.studName = studName;
	}
}