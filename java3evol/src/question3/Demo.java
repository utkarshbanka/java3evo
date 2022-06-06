package question3;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Demo {

	
	
	void showDetails(Month m) 
	{
		switch(m)
		
		{
		case January : System.out.println("This is the 1 nd Month of the Year jan");
		   break;
		case feb : System.out.println("This is the 2 nd Month of the Year feburary");
		   break;
		   
		case march : System.out.println("This is the 3 nd Month of the Year march");
		   break;
		case aprial: System.out.println("This is the 4 nd Month of the Year aprial");
		   break;
		   
		case may : System.out.println("This is the 5 nd Month of the Year may");
		   break;
		case jun : System.out.println("This is the 6 nd Month of the Year june");
		   break;
		   
		case july : System.out.println("This is the 7 nd Month of the Year july");
		   break;
		case augest : System.out.println("This is the 8 nd Month of the Year Augest");
		   break;
		case september : System.out.println("This is the 9 nd Month of the Year September");
		   break;
		case octuber: System.out.println("This is the 10 nd Month of the Year Octuber");
		   break;
		case november : System.out.println("This is the 11 nd Month of the Year November");
		   break;
		case December : System.out.println("This is the 12 nd Month of the Year December");
		   break;
		default: System.out.println("Invalid Month Name");
		   break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Demo month = new Demo();
       try {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Month name");
       String name = sc.next();
        Month mon = Month.valueOf(name);
        
        month.showDetails(mon);
       }
       catch (java.util.InputMismatchException ime)
       {
    	   System.out.println("Invalid Month");
       }
       
       
       
      
       
	}

}
