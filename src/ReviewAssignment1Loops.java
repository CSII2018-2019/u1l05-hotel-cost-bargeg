import javax.swing.JOptionPane;

//Genna Barge- Review Assignment #1 Hotels 
public class ReviewAssignment1Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//define the base price per night for each hotel 
		int grimsborgir = 450;
		int ranga = 500;
		int hilton = 250;
		int nights = 0;
		int grimsborgirstar = 0;
		int rangastar = 0;
		int hiltonstar = 0;
		
//introduction 
		JOptionPane.showMessageDialog(null, "Welcome to Iceland!" +
				"\nFirst, we'll get you set-up with a hotel!"); 
		

		//Ask for input on how many nights they would like to stay
//input validation loop!!
		do {
			String input = JOptionPane.showInputDialog("How many nights would you like to stay?");
			nights = Integer.parseInt(input);
		} while (nights <= 0);
	
		
//Multiply base number of each hotel by the # of nights stayed
		grimsborgir *= nights;
		ranga *= nights;
		hilton *= nights;
		
		
//divide that number per hotel by 50 and enter a while loop
		grimsborgirstar = grimsborgir/50;
		rangastar = ranga/50;
		hiltonstar = hilton/50;
		
		
				
		
// while that number is not equal to zero, print out a star
		System.out.println("The price to stay at the grimsborgir is: ");
		
		while (grimsborgirstar > 0){
			System.out.print("*");
			grimsborgirstar -=1; 
		}
		System.out.println(" $" + grimsborgir);
		
		System.out.println("The price to stay at the ranga is: ");
		
		while (rangastar > 0){
			System.out.print("*");
			rangastar -=1; 
		}
		System.out.println(" $" + ranga);
		
		System.out.println("The price to stay at the hilton is: ");
		
		while (hiltonstar > 0){
			System.out.print("*");
			hiltonstar -=1; 
		}
		System.out.println(" $" + hilton);
		
		
//perform that loop for each hotel to get a bar graph for each hotel
		
	}

}
