import java.util.Scanner;

public class Banking extends Amountwithdraw
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banking b1=new Banking();
		b1.addUser();
		b1.viewUser();
		b1.checkbalance();
		b1.deposit();
		b1.withdraw();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.AmountDeposit");
		System.out.println("2.AmountWithdraw");
		System.out.println("3.BalanceCheck");
		System.out.println("**********************");
		System.out.println("enter number you want=");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1: b1.deposit();
				break;
		
		case 2: b1.withdraw();
				break;
		case 3: b1.checkbalance();
				break;
		
		}
		
		
		
	}

}
