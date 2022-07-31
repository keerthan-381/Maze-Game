
public class Node {
               
	private char[] Actual_Rooms;
	private static int CONSTANT_SIZE = 20;
	private int Position;
	Match Create_Match;
	
	//constructor
	public Node()
	{
		Actual_Rooms = new char[CONSTANT_SIZE];
		Position = 0;
		Create_Match = new Match();
	}
	
	// Return size
	public int size()
	{
		return Actual_Rooms.length;
	}
	
	// Add 'room' to array
	public void add(char Data)
	{
		Actual_Rooms[Position] = Data;
		Position++;
	}
	
	// First parameter is key, Second parameter is Value
	// 1st - North, 2nd - South, 3rd - West, 4th - East
	
	public void Create_Neighbours()
	{
		Create_Match.Make_Neighbour(Actual_Rooms[0], new char[] { ' ', 'B', ' ', 'K'});
		Create_Match.Make_Neighbour(Actual_Rooms[1], new char[] { 'A', 'C', ' ', 'L'});
		Create_Match.Make_Neighbour(Actual_Rooms[2], new char[] { 'B', 'D', ' ', 'M'});
		Create_Match.Make_Neighbour(Actual_Rooms[3], new char[] { 'C', 'E', ' ', 'N'});
		Create_Match.Make_Neighbour(Actual_Rooms[4], new char[] { 'D', ' ', ' ', ' '});
		Create_Match.Make_Neighbour(Actual_Rooms[5], new char[] { ' ', 'G', 'K', 'P'});
		Create_Match.Make_Neighbour(Actual_Rooms[6], new char[] { 'F', 'H', 'L', ' '});
		Create_Match.Make_Neighbour(Actual_Rooms[7], new char[] { 'G', ' ', ' ', 'R'});
		Create_Match.Make_Neighbour(Actual_Rooms[8], new char[] { ' ', 'J', 'N', 'S'});
		Create_Match.Make_Neighbour(Actual_Rooms[9], new char[] { 'I', ' ', ' ', ' '});
		Create_Match.Make_Neighbour(Actual_Rooms[10], new char[] { ' ', 'L', 'A', 'F'});
		Create_Match.Make_Neighbour(Actual_Rooms[11], new char[] { 'K', 'M', 'B', 'G'});
		Create_Match.Make_Neighbour(Actual_Rooms[12], new char[] { 'L', 'N', 'C', ' '});
		Create_Match.Make_Neighbour(Actual_Rooms[13], new char[] { 'M', 'O', 'D', 'I'});
		Create_Match.Make_Neighbour(Actual_Rooms[14], new char[] { 'N', ' ', 'E', ' '});
		Create_Match.Make_Neighbour(Actual_Rooms[15], new char[] { ' ', 'Q', 'F', ' '});
		Create_Match.Make_Neighbour(Actual_Rooms[16], new char[] { 'P', 'R', ' ', ' '});
		Create_Match.Make_Neighbour(Actual_Rooms[17], new char[] { 'Q', ' ', 'H', ' '});
		Create_Match.Make_Neighbour(Actual_Rooms[18], new char[] { ' ', 'T', 'I', ' '});
		Create_Match.Make_Neighbour(Actual_Rooms[19], new char[] { 'S', ' ', ' ', ' '});
	}
	
	// Returns the string containing neighbours of a room
	public String Show_Matches(char c)
	{
		for(char Found: Create_Match.Valid_Neighbours.keySet()) 
		{
			// Formatting the string to have better view of position
			if ( c == Found)
			{
				StringBuilder sb = new StringBuilder();
				char[] Elements = Create_Match.Valid_Neighbours.get(Found);
				sb.append("        " + Elements[0] + "\n" + Get_Direction('V'));
				sb.append(Elements[2] + Get_Direction('H') + c + Get_Direction('H') + Elements[3] + "\n");
				sb.append(Get_Direction('V') + "        " + Elements[1]);
				return sb.toString();
			
			}
		}
		return null;
	}
	
	// Helper method for the above string formatting method
	private static String Get_Direction(char Direction)
	{
		StringBuilder sb = new StringBuilder();
		
		if(Direction == 'V')
		{
			for (int i = 0; i < 2; i++)
			{
				sb.append("        |\n");
			}
		}
		
		else 
		{
			sb.append(" ");
			for (int i = 0; i < 5; i++)
			{
				sb.append("-");
			}
			sb.append(" ");
		}
		
	return sb.toString();
	
}
}
