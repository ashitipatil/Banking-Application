import java.util.Scanner;

public class AmountDeposit extends AccountDetails
{
	int damount;
	Scanner sc=new Scanner(System.in);
	
	void deposit()
	{
		System.out.println("deposit ammount=");
		damount=sc.nextInt();
		balance=damount+balance;
		System.out.println("current balance="+balance);
	}
}
