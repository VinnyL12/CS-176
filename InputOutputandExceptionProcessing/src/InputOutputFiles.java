import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Used to test the BlankLinesRemover class.
 */
public class InputOutputFiles 
{
	public static void main(String[] args)  
	
	{
		String file;
		PrintWriter outputFile;
		boolean check = false;

		while (!check) 
		{
			Scanner in = new Scanner(System.in);

			System.out.println("Please enter the path to open the input file for example C:\\\\Downloads\\\\lines.txt : ");
			file = in.nextLine();
			
			try 
			{
				outputFile = new PrintWriter("C:\\Users\\User\\Downloads\\outlines.txt");
								
				File inputFile = new File(file);
				Scanner newFile = new Scanner(inputFile);
				
				System.out.println("The filepath entered exists, input the text you would like to save within the file (terminate program to save).");
				check = true;
				
				while (in.hasNextLine()) {
					String what = in.nextLine();
					outputFile.print(what);
				}
				in.close();
				newFile.close();
				outputFile.close();

			} 
			catch (FileNotFoundException exception) 
			{
				System.out.println("File cannot be located, please input another file.");
			}
		}

	}
}