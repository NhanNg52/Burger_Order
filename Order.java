//HUU NGUYEN CIS 35A
//This program will display DA Menu's Food court with 5 different 
//types of burgers for students and staff at DA College. It also 
//collects data by asking users how many burgers they want in 
//different types and eventually print the bill with the total
//before tax and after tax.Program also deals with abstract classes, 
//interfaces, and Text I/O.

package Final;
import java.util.Scanner;

public abstract class Order implements OrderInterface {
	
	//Constructor
	public Order() {
		
	}
	
	private double  PRICE1 = 5.25;
	private double  PRICE2 = 5.75;
	private double  PRICE3 = 5.95;
	private double  PRICE4 = 5.95;
	private double  PRICE5 = 5.95;
	
	public void displayMenu() {
		System.out.println("MENU");
		System.out.println("=============================");
		System.out.println("#1: De Anza Burger  $"+PRICE1);
		System.out.println("#2: Bacon Cheese    $"+ PRICE2);
		System.out.println("#3: Mushroom Swiss  $"+ PRICE3);
		System.out.println("#4: Western Burger  $"+PRICE4);
		System.out.println("#5: Don Cali Burger $"+PRICE5);
		System.out.println("#6: Exit");
		System.out.println("=============================");
	}
	
	
	
	public abstract void getInputs();
	
	public abstract void calculate();
	
	public abstract void printBill();

	public abstract void saveBillToFile();

}



