import java.util.Scanner;

public class Amountwithdraw extends AmountDeposit 
{
	int wamount;
	Scanner sc=new Scanner(System.in);
	void withdraw()
	{
		System.out.println("withdrawal ammount=");
		wamount=sc.nextInt();
		if(balance-wamount > 4999)
		{
			balance=balance-wamount;
			System.out.println("current balance ="+balance);
		}
		else
		{
			System.out.println("less balance");
		}
		
	}
}
