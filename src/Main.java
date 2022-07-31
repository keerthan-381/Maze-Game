
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Node Initial_Room_List = new Node();
		char Starting_Room = 'A';
		for(int i = Starting_Room; i <= 'T'; i++)
		{
			Initial_Room_List.add(Starting_Room);
			Starting_Room++;
		}
		
		// The createNeighbours() method will create neighbors using a map
		// Keys would be the actual rooms, the values would be its corresponding neighbors
		
		Initial_Room_List.Create_Neighbours();
		
		
		char Current_Room = 'K';
		char Target_Room = 'P';
		
		
		Scanner sc = new Scanner(System.in);
		int No_of_Attempts = 0;
		
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ __ _ _ ");
		System.out.println("|                                                                                                         |");
		System.out.println("|                                                             HEY!!                                       |");
		System.out.println("|                                                                                                         |");
		System.out.println("|                                                     WELCOME TO THE MAZE GAME                            |");
		System.out.println("|                                                                                                         |");
		System.out.println("| INSTRUCTIONS:                                                                                           |");
		System.out.println("|                                                                                                         |");
		System.out.println("| 1) There are " + Initial_Room_List.size() + " rooms in this maze                                                                      |");
		System.out.println("| 2) You current position is in room " +Current_Room + "                                                                    |");
		System.out.println("| 3) You will able to see your 4 neighbour rooms                                                          |");
		System.out.println("| 4) The rooms are labelled by Alphabets                                                                  |");
		System.out.println("| 5) The neighbouring rooms are listed to your North, South, West and East positions respectively         |");
		System.out.println("| 6) If the Neighbouring is empty, it means you don't have a neighbour at the location                    |");
		System.out.println("|                                                                                                         |");
		System.out.println("|                                                     Let's start the fun                                 |");
		System.out.println("|                                                       ALL THE BEST :)                                   |");                 
		System.out.println("|                                                                                                         |");
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
		
		String Output = Initial_Room_List.Show_Matches(Current_Room);
		
		System.out.println("\nYou are at room: " + Current_Room );
		System.out.println("Your neighbours are ");
		System.out.println(Output);
		
		System.out.println("Choose where you want to be headed: ");
		Current_Room = Upper_Case(sc.next().charAt(0));
		No_of_Attempts++;
		
		while((!Letters(Output, Current_Room)) || (Current_Room != Target_Room))
		{
			// Exceptional handling
			if(!Letters(Output, Current_Room))
			{
				while(!Letters(Output, Current_Room))
				{
					System.out.println("\nInvalid entry. Please check your neighbours and entry a valid neighbour  \n ");
					System.out.println(Output + "\n");
					Current_Room = Upper_Case(sc.next().charAt(0));
					No_of_Attempts++;
				}
			}
			else
			{
				System.out.println("Your neighbours are");
				System.out.println(Initial_Room_List.Show_Matches(Current_Room));
				Output = Initial_Room_List.Show_Matches(Current_Room);
				System.out.println("\nChoose where you want to be headed: ");
				Current_Room = Upper_Case(sc.next().charAt(0));
				No_of_Attempts++;
			}
		}
		sc.close();
		
		//reaches end
		System.out.println("\nHurrahh!!, CONGRATULATIONS, You made it. ");
		System.out.println("                Good Work                  ");
		System.out.println("You took " + No_of_Attempts + " moves to finish the game\n");
		System.out.println("            Hope you like this game        ");
		System.out.println("             Have a great day              ");
		System.out.println("           Thank you for playing           ");
		
		
	}
		
		
		
		private static boolean Letters(String arr, char Current_Room)
		{
			for(int i = 0; i < arr.length(); i++)
			{
				if(arr.charAt(i) == Current_Room)
				{
					return true;
				}
			}
			return false;
		}
		

		private static char Upper_Case(char c)
		{
			if((c >= 65) && (c <= 90))
			{
				return c;
			}
			
			// 'a' = 97, 'A' = 65, so from 'a' to 'A' would be 'a' - 32
			return (char) (c - 32);
		}
		
}
	


