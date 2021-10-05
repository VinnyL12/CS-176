import java.util.ArrayList;

import java.util.Scanner;

public class ColorSearch 
{
	
	public static void SearchColor(ArrayList<String>colors, String colorInput) //Collects user data in constructor.
	{
		int count = 0;
		boolean found = true;
		
		for(String searchedColor: colors)
		{
			count ++; //Increments number of searches.
			if(searchedColor.equalsIgnoreCase(colorInput))
			{
				break;
			}
		}
		
		if(found)
		{
			System.out.println("After " + count + " searches, " + colorInput + " was found.");
		}
		
		else
		{
			System.out.println("After " + count + " searches, " + colorInput + " was found.");
		}
		
	}
	
	public static void main(String[] args) 
	{
		
		ArrayList<String> colors = new ArrayList<String>();
		
		Scanner in = new Scanner(System.in);
		boolean found = true;
		
		while(found) //Responsible for adding user inputs to array.
		{
			System.out.println("Enter a color name, or 'Q' to quit: ");
			String colorInput = in.nextLine();
						
			if(colorInput.equalsIgnoreCase("Q"))
			{
				break;
			}
			else 
			{
				colors.add(colorInput);
			}
		
		}
			
		while(found) //Responsible for sending search information to SearchColor() method.
		{
			System.out.println("Enter a color to search for, or 'Q' to quit " );
			String searchedColor = in.nextLine();
			if(searchedColor.equalsIgnoreCase("Q"))
			{
				break;
			}
			else
			{
				SearchColor(colors, searchedColor);
			}
		}		
		in.close();
	}	

}
	



