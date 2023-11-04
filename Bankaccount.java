import java.util.*;
interface ATMMachine
{
    final double min_balance=1000;
    final double actual_balance=20000;
    public double withdraw(double cash);
    public double deposit(double money);
    public double checkBalance();
} 
class ATM implements ATMMachine
{
    double amount;
    double balance;
    double total_balance;
public double withdraw(double amount)
        {
            if(amount>=min_balance)
            {
                System.out.println("You can now withdraw enter amount");
                amount=actual_balance-amount;
                System.out.println("Remaining balance is : "+amount);
                this.amount=amount;
            }
            else
            {
                System.out.println("Sorry! you should maintain minimum balance");
            }
            return this.amount;
        }public double deposit(double amount)
        {
            System.out.println(amount+" is deposited");
            amount=amount+actual_balance;
            System.out.println("Total balance is:"+amount);
            balance=amount;
            return balance;
        }public double checkBalance(double amount,double balance)
        {
            if(amount>=min_balance)
            total_balance=actual_balance-amount+balance;
            else
            total_balance=actual_balance+balance;
            System.out.println("Balance in your account is:"+total_balance);
            return 0.0;
        }  
}
public class Bankaccount extends ATM
{
    public static void main(String args[])
    {
        double x,y;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter amount to withdraw:");
        x=s.nextDouble();
        System.out.println("Enter amount to be deposited:");
        y=s.nextDouble();
        ATM atm=new ATM();
        atm.withdraw(x);
        atm.deposit(y);
        atm.checkBalance(x,y);
        s.close();
    }
}