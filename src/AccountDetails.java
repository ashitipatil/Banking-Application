import java.util.Scanner;

public class AccountDetails {
	int accno;
	String name;
	int balance;
	Scanner sc=new Scanner(System.in);
	
	void addUser()
	{
		System.out.println("enter user account number =");
		accno=sc.nextInt();
		System.out.println("enter user name=");
		name=sc.next();
		System.out.println("enter user balance=");
		balance=sc.nextInt();
	}
	void viewUser()
	{
		System.out.println("accout number is ="+accno);
		System.out.println("user name is="+name);
		
	}
	void checkbalance()
	{
		System.out.println("balance is ="+balance);
	}
}
