package Final;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class OrderBurger extends Order {
	
	private static double TAX = 0.09;
	private int Option;	
	private static double total_beforeTax;
	private static double total_afterTax;
	
	public int getOption() {
		return Option;}

	public void setOption(int option) {
		Option = option;}

	public double getTotal_beforeTax() {
		return total_beforeTax;}

	public void setTotal_beforeTax(double total_beforeTax) {
		this.total_beforeTax = total_beforeTax;}

	public double getTotal_afterTax() {
		return total_afterTax;}

	public void setTotal_afterTax(double total_afterTax) {
		this.total_afterTax = total_afterTax;}
	static double sum =0;
	int takeQuantities=0;
	
	public void getInputs() {
		//Variable for getInputs() method	
		double total_beforeTax=0;
		int sumAmount=0;
		String Item[] = new String[] {"De Anza Burger", "Bacon Cheese", "Mushroom Swiss","Western Burger", "Don Cali Burger"};
		String takeItem[]= new String[100];
		int i=0;
		int amount=0;
		System.out.println("\nEnter 1-5 for options or 6: EXIT");
		Scanner input = new Scanner (System.in);
		Option = input.nextInt();
		if (Option==6) {
			System.out.println("Thank you");
			System.exit(0);}               			//The program will exit out of the current method, not execute printBill();
												
		do {
			if (Option==1) {
				takeItem[i]=Item[0];				//Create empty array takeItem to store Items' name
				System.out.println("How many "+takeItem[i]);
				amount = input.nextInt();
				total_beforeTax = 5.25*amount;
				System.out.println("Your order: "+amount+" "+ takeItem[i]);
				sumAmount+= amount;					//sumAmount will count the total burgers users want at the end.
				sum += total_beforeTax; 			//sum will add up cost for total cost before tax.
			}
			else if (Option==2) {
				takeItem[i]=Item[1];
				System.out.println("How many "+takeItem[i]);
				amount = input.nextInt();
				total_beforeTax =5.75*amount;
				System.out.println("Your order: "+amount+" "+ takeItem[i]);
				sumAmount+= amount;
				sum += total_beforeTax;
				}
			
			else if (Option==3){
				takeItem[i]=Item[2];
				System.out.println("How many "+takeItem[i]);
				amount = input.nextInt();
				total_beforeTax = 5.95*amount;
				System.out.println("Your order: "+amount+" "+ takeItem[i]);
				sumAmount+= amount;
				sum += total_beforeTax;
			}
			
			else if (Option==4) {
				takeItem[i]=Item[3];
				System.out.println("How many "+takeItem[i]);
				amount = input.nextInt();
				total_beforeTax = 5.95*amount;
				System.out.println("Your order: "+amount+" "+ takeItem[i]);
				sumAmount+= amount;
				sum += total_beforeTax;}
			
			else if (Option==5) {
				takeItem[i]=Item[4];
				System.out.println("How many "+takeItem[i]);
				amount = input.nextInt();
				total_beforeTax = 5.95*amount;
				System.out.println("Your order: "+amount+" "+ takeItem[i]);
				sumAmount+= amount;
				sum += total_beforeTax;}
			
			else if (Option==6) {
				break;}
				
			else if (Option >6 || Option <0) {
				System.out.println("Select the right number!");	
			}
			System.out.println("\nEnter 1-5 for options or 6: EXIT");
			Option = input.nextInt();
		}while (Option!= 6);
		
		takeQuantities= sumAmount;
	}

	
	@Override
	public void calculate() {
		double total11= sum+sum*TAX;
	}

	
	//Omit printBill() and saveBillToFile()
	@Override
	public void printBill() {

		double total11 = 0;
		System.out.println("Student: Press 1 or Staff: Press 2");
		Scanner input = new Scanner (System.in);
		int a = input.nextInt();
		
		if (a==1) {
			total11 = sum;
			try {
				PrintStream myBill = new PrintStream(new File("SaveBill.txt"));
				System.setOut(myBill);
				myBill.println("\nThe quantities: "+takeQuantities+" burgers");
				myBill.println("The total before tax is: $"+sum);
				myBill.println("No tax amount!");
				myBill.printf("Total price after tax: $%.2f", total11);
			}
			catch(FileNotFoundException fx) {
				System.out.println(fx);
			}
			
		}
		else if (a==2) {
			total11 = sum + sum * TAX;
			try {
				PrintStream myBill = new PrintStream(new File("SaveBill.txt"));
				System.setOut(myBill);
				myBill.println("\nThe quantities: "+takeQuantities+" burgers");
				myBill.println("The total before tax is: $"+sum);
				myBill.println("Tax amount: "+ TAX*100+" %");
				myBill.printf("Total price after tax: $%.2f", total11);
			}
			catch(FileNotFoundException fx) {
				System.out.println(fx);
			} 
		}	
		
	}
	
	@Override
	public void saveBillToFile() {
	}
}

//OUTPUT1:
/*MENU
=============================
#1: De Anza Burger  $5.25
#2: Bacon Cheese    $5.75
#3: Mushroom Swiss  $5.95
#4: Western Burger  $5.95
#5: Don Cali Burger $5.95
#6: Exit
=============================

Enter 1-5 for options or 6: EXIT
1
How many De Anza Burger
5
Your order: 5 De Anza Burger

Enter 1-5 for options or 6: EXIT
2
How many Bacon Cheese
6
Your order: 6 Bacon Cheese

Enter 1-5 for options or 6: EXIT
3
How many Mushroom Swiss
1
Your order: 1 Mushroom Swiss

Enter 1-5 for options or 6: EXIT
4
How many Western Burger
2
Your order: 2 Western Burger

Enter 1-5 for options or 6: EXIT
5
How many Don Cali Burger
4
Your order: 4 Don Cali Burger

Enter 1-5 for options or 6: EXIT
6
Student: Press 1 or Staff: Press 2
1*/

//OUTPUT2:
/*MENU
=============================
#1: De Anza Burger  $5.25
#2: Bacon Cheese    $5.75
#3: Mushroom Swiss  $5.95
#4: Western Burger  $5.95
#5: Don Cali Burger $5.95
#6: Exit
=============================

Enter 1-5 for options or 6: EXIT
2
How many Bacon Cheese
5
Your order: 5 Bacon Cheese

Enter 1-5 for options or 6: EXIT
3
How many Mushroom Swiss
1
Your order: 1 Mushroom Swiss

Enter 1-5 for options or 6: EXIT
4
How many Western Burger
5
Your order: 5 Western Burger

Enter 1-5 for options or 6: EXIT
1
How many De Anza Burger
2
Your order: 2 De Anza Burger

Enter 1-5 for options or 6: EXIT
6
Student: Press 1 or Staff: Press 2
2*/
