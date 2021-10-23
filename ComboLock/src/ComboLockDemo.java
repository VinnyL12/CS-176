// Vincent Loretta
import java.util.Scanner;

public class ComboLockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		while(true)
		{
			ComboLock combo = new ComboLock(10, 20, 30);
			combo.reset();
			
			System.out.println("Enter number of ticks to turn to the right 0-39. Enter an invalid number to quit.");
			int turn = in.nextInt();
			
			if(turn < 0 || turn > 39)
			{
				break;
			}
			combo.turnRight(turn);
			
			
			System.out.println("Enter number of ticks to turn to the left 0-39. Enter an invalid number to quit.");
			turn = in.nextInt();
			
			if(turn < 0 || turn > 39)
			{
				break;
			}
			combo.turnLeft(turn);
			
			
			System.out.println("Enter number of ticks to turn to the right 0-39. Enter an invalid number to quit.");
			turn = in.nextInt();
			
			if(turn < 0 || turn > 39)
			{
				break;
			}
			combo.turnRight(turn);
			
			combo.open();
			
			System.out.println();
		}
		in.close();
	}

}
