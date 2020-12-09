import java.io.*; 

class Robot { 
	static void Position(String move) 
	{ 
		int l = move.length(); 
		int countUp = 0, countDown = 0; 
		int countLeft = 0, countRight = 0; 
		int box = 0;
		int start_point = 0;
		int drop = (-9);

			System.out.println("start point is:("
			+ (countRight - countLeft)+ ", "
			+ (countUp - countDown) +")"); 
			
		// traverse the instruction string 
		// 'move' 
		for (int i = 0; i < l; i++) { 

			// U = UP; D= down; L = left; R = right; B = box ; A= box drop area S start point
			if (move.charAt(i) == 'U') {
			countUp++; 
			System.out.println("position is: ("
			+ (countRight - countLeft)+ ", "
			+ (countUp - countDown) +")"); 
			}
			
			else if (move.charAt(i) == 'D') {
				countDown++; 
				System.out.println("position is: ("
			+ (countRight - countLeft)+ ", "
			+ (countUp - countDown) +")"); 
			}
			
			else if (move.charAt(i) == 'L') {
				countLeft++; 
				System.out.println("position is: ("
			+ (countRight - countLeft)+ ", "
			+ (countUp - countDown) +")"); 
			}
			
			else if (move.charAt(i) == 'R') {
				countRight++; 
			System.out.println("position is: ("
			+ (countRight - countLeft)+ ", "
			+ (countUp - countDown) +")"); 
			}
			
			else if (move.charAt(i) == 'B')
		    System.out.println("carry the box from: ("
			+ (countRight - countLeft)+ ", "
			+ (countUp - countDown) +")"); 
			
			else if (move.charAt(i) == 'S'){
				
               countDown = 9;
               countLeft = -4;
 
			System.out.println("Drop the box at: ("
			+ (countRight - countLeft)+ ", "
			+ (countUp - countDown) +")"); 
			}			
		}			
             countDown=0;
             countLeft=0;
             countRight=0;
             countUp=0;
		// required final position of robot 
	     	System.out.println("End Point after all: ("
			+ (countRight - countLeft)+ ", "
			+ (countUp - countDown) + ")"); 
	} 
	
	public static void main(String[] args) 
	{ 
		String move = "URUBRRRRBALLDS"; 
		Position(move); 
	} 
} 