
interface Sayable
{
	public String say(String name);
}

public class Lambda_SinglePara
{
	public static void main(String[] args) 
	{

			// Lambda expression with single parameter.
		Sayable s1=(name) -> { return "Hello, "+name; };
		
		System.out.println(s1.say("Ravi"));
		
			// You can omit function parameter parentheses    
		Sayable s2= name -> { return "Hello, "+name; };
		System.out.println(s2.say("Ravi"));
	}
}