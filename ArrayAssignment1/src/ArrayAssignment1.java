
public class ArrayAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double [] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		double maxNumb = values[0];
		int negative = 0;
		
		System.out.println(values[0] + " " + values[1] + " " + values[2] + " " + values[3] + " " + values[4] + " " + values[5] + " " + values[6] + " " + values[7] + " " + values[8] + " " + values[9]);
		
		for(int i = 0; i < values.length; i++)
		{
			if (values[i] > maxNumb)
			{
				maxNumb = values[i];
			}
			if (values[i] < 0)
			{
				negative++;
			}
		}  
		
		System.out.println();
		System.out.println("Maximum Number: " + maxNumb);
		System.out.println();
		System.out.println("Amount of Negative Numbers: " + negative);
		
	}

}
