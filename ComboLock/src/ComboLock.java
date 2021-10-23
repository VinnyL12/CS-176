// Vincent Loretta
public class ComboLock {
	
	private int secret1 = 0;
	private int secret2 = 0;
	private int secret3 = 0;
	
	private boolean turn1 = false;
	private boolean turn2 = false;
	private boolean turn3 = false;
	
	private int currentPosition = 0;
	
	private boolean begin = true;
	
	private boolean success = false;
		
	public ComboLock(int secret1, int secret2, int secret3)
	{
		this.secret1 = secret1;
		this.secret2 = secret2;
		this.secret3 = secret3;
	}
	
	public void reset()
	{
		currentPosition = 0;
		
		turn1 = false;
		turn2 = false;
		turn3 = false;
		
		begin = true;
	}
	
	public void turnLeft(int ticks)
	{
		currentPosition = currentPosition + ticks;
		
		if(currentPosition > 39)
		{
			currentPosition = currentPosition % 40;
		}
			
		if(turn1)
		{
			if(currentPosition == secret2)
			{
				turn2 = true;
			}
		}
	}
	
	public void turnRight(int ticks)
	{
		currentPosition = currentPosition - ticks;
		
		if(currentPosition < 0)
		{
			currentPosition = currentPosition + 40;
		}
		
		if(begin)
		{
			if(currentPosition == secret1)
			{
				turn1 = true;
			}
		}
		
		if(turn2)
		{
			if(currentPosition == secret3)
			{
				turn3 = true;
			}
		}
	}
	
	public boolean open()
	{
		if(turn1 && turn2 && turn3)
		{
			success = true;
			System.out.println("You opened the lock!");
		}
		else
		{
			success = false;
			System.out.println("You did not open the lock.");
		}
		return success;
	}
}
