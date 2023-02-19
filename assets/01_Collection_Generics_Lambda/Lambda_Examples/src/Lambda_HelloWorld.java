@FunctionalInterface
interface IMessage
{
	public void greet();
}
public class Lambda_HelloWorld {
	
	public static void main(String args[])
	{
		
		IMessage msg = () ->{ System.out.println("Hello World!");};
		msg.greet();
	}
}
