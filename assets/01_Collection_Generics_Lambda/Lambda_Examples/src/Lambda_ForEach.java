import java.util.Arrays;
import java.util.List;

public class Lambda_ForEach {
	public static void main(String args[])
	{
		String[] names = {"Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer", "Andy Murray", "Tomas Berdych", "Juan Martin Del Potro"};

		List<String> players =  Arrays.asList(names);
	
		// /*       
		// Old looping
		System.out.println("\n\nOld looping :");
		for (String player : players) 
		{
		     System.out.print(player + "; ");
		}
		
		System.out.println("\n\nUsing lambda expression :");
		
		// Using lambda expression and functional operations
		players.forEach((player) -> System.out.print(player + "; "));
		// */
		System.out.println("\n\nUsing Method Reference :");
		// Using double colon operator in Java 8 (Method Reference
		players.forEach(System.out::println);
	}
	

}
