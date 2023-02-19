interface IAddition
{
	public void addition(int a, int b);
}

public class Lambda_TwoPara {
	public static void main(String args[])
	{
		IAddition I1 = new IAddition()
		{
			public void addition(int a, int b)
			{
				System.out.println("a + b = "+ (a + b));
			}
		}; //Anonymous class definition
		
		I1.addition(25, 12);
		
		IAddition I2 = (int a, int b) -> {System.out.println("a + b = "+ (a + b));};
		
		I2.addition(15, 10);
		
	}
	
	

}
