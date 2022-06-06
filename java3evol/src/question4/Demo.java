package question4;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.regex.Pattern;
public class Demo {

	public boolean validate(String user, String pass, String mob)
	{
		boolean nam = Pattern.matches("[a-zA-Z]{3,8}",user);
		boolean pas = Pattern.matches("[a-zA-Z]{3,8}",pass);
		boolean mo = Pattern.matches("[6789]{1}[0-9]{9}",mob);
//		boolean e = Pattern.matches("[a-zA-Z]{3,8}",em);
		if(nam == true && pas==true && mo==true)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Your Username");
      String user = sc.next();
      System.out.println("Enter Your Password");
      String pass = sc.next();
      System.out.println("Enter Your mobile");
      String mob = sc.next();
      System.out.println("Enter Your email");
      String em = sc.next();
      
      Demo sit = new Demo();
      boolean result = sit.validate(user,pass,mob);
      if(result)
      {
    	  Customer cus = new Customer();
    	  cus.setUsername(user);
    	  cus.setPassword(pass);
    	  cus.setEmail(em);
    	  cus.setMobileNumber(mob);
    	  System.out.println("Username is :" + cus.getUsername());
    	  System.out.println("Your Password is:"+ cus.getPassword());
    	  System.out.println("Email Address"+ cus.getEmail());
    	  System.out.println("Mobile Number"+ cus.getPassword());
      }
      else 
      {
    	  System.out.println("Something went wrong");
      }
      
	}

}
