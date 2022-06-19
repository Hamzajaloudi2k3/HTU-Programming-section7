

	import java.util.*; 
	public class DisplaySevenSegment {
		public static void main(String args[]) throws Exception { 
			Scanner sc = new Scanner(System.in); 
			System.out.print("Enter a digit you want to display: "); 
			//reads a digit from the user 
			int n = sc.nextInt(); 
			//switch to the corresponding digit case
			switch(n) {
			case 0:
				System.out.println(" _ \n| | \n||");
			
				case 1:
					System.out.println(" \n |\n |");
				
				case 2: 
					System.out.println(" _ \n _|\n| "); 
				
				case 3:
					System.out.println(" _ \n |\n _|"); 
				
					case 4: 
						System.out.println(" _ \n||\n |");
					
					case 5:
						System.out.println(" _ \n|_ \n |");
					
					case 6: 
						System.out.println(" _ \n| \n||"); 
					
					case 7: 
						System.out.println(" _  \n  | \n  | \n"); 
						
						case 8:
							System.out.println(" _ \n||\n||");
						
							case 9:
								System.out.println(" _ \n||\n _|"); 
								break; 
								}
			}
		
	}

