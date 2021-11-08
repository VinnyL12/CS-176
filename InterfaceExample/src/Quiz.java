
public class Quiz implements Measurable
{
	private double quizInputs;
	
	public Quiz(double input)
	{
		this.quizInputs = input;
	}
	
	public double getMeasure()
	{
		return quizInputs;
	}

}
