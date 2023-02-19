
class GenCalculator<T extends Number> {
	T num1;
	T num2;
	
	public  GenCalculator(T n1,T n2)
	{
		num1=n1;
		num2=n2;
	}
	
	public double add()
	{
		return (num1.doubleValue() + num2.doubleValue());
	}

	public double sub()
	{
		return (num1.doubleValue() - num2.doubleValue());
	}
	
	public double mul()
	{
		return (num1.doubleValue() * num2.doubleValue());
	}

	public double div()
	{
		return (num1.doubleValue() / num2.doubleValue());
	}


}

public class GenCalcDemo
{
	public static void main(String[] args) 
	{
		
		GenCalculator<Integer> c1=new GenCalculator<Integer>(15,5);
		
		
		System.out.println("Addition = "+ c1.add());
		
		System.out.println("Subraction = " + c1.sub());
		
		System.out.println("Multiplication = " + c1.mul());
		
		System.out.println("Division = " + c1.div());
	}
}
