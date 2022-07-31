import java.util.HashMap;
import java.util.Map;


public class Match {
	Map<Character, char[]> Valid_Neighbours;
	
	public Match()    // constructor
	{
		Valid_Neighbours = new HashMap<>();
	}
	
	// key-value pair 
	public void Make_Neighbour(char c, char[] Neighbour_Array)
	{
		Valid_Neighbours.put(c,Neighbour_Array);
	}
	
}
