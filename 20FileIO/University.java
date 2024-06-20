import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class University
{
	public static void main(String[] args) throws FileNotFoundException , IOException , ClassNotFoundException
	{
		File textFile = new File("C:\\fullstack\\Core Java\\20FileIO.\\textFile.txt");
		FileInputStream fis = new FileInputStream(textFile);
		ObjectInputStream ois = new ObjectInputStream(fis);

		Student st1 = (Student) ois.readObject();
		System.out.println(st1.studId + " " + st1.studName);
	}
}