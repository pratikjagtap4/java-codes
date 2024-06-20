import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class College
{
	public static void main(String[] args) throws FileNotFoundException , IOException
	{
		Student st1 = new Student(101 , "Pratik");
		File txtFile = new File("C:\\fullstack\\Core Java\\20FileIO.\\textFile.txt");
		FileOutputStream fis = new FileOutputStream(txtFile);
		ObjectOutputStream oos = new ObjectOutputStream(fis);

		oos.writeObject(st1);
	}
}
		