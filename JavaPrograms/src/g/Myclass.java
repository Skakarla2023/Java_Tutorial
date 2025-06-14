package g;
import java.util.Scanner;                   //importing the scanner class from util package using import keyword

 class Myclass {
	 public static void main(String[] args)
	 {
		 Scanner myobj=new Scanner(System.in);   //creating an object in the Scanner class
		 System.out.println("Enter username:");
		 String username=myobj.nextLine();   //nextline() method is used to read a complete line.
		 System.out.println("Username:"+username);
	 }

}
