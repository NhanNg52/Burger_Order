package Final;
import java.util.*;

public class Driver {

	public static void main(String[] args) {
		int amount=0;
		int Option=0;
		double total_beforeTax = 0;
		double total_afterTax = 0;
		
		
		
		  OrderBurger order = new OrderBurger();

          // Order ord = new Order(); <= Cannot instantiate the type Order because Order is an abstract class                  

          order.displayMenu();        //displays the men                   
          order.getInputs();          //gets inputs                   
          order.calculate();          //calculates cost                  
          order.printBill();           //prints bill
          order.saveBillToFile();          //saves the bill in a text file

	}
	
}
