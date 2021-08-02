package mypackage;
import java.io.File;
import java.io.FileNotFoundException;
public class Myclass
{

	public static void main(String[] args) throws FileNotFoundException
	{
		File f1 = new File ("C:\\Bhagya\\Shelar.txt");
		  System.out.println("File name:"+f1.getName());
		  System.out.println("complete path:"+f1.getPath());
		  System.out.println("complete path:"+f1.exists());
}
}