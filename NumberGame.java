import java.util.Random;
import java.util.Scanner;
class NumberGame
{
   public static void main(String[] args)
   {
      int guess;
      Random random = new Random();
      int random_num = random.nextInt(101);
      System.out.println("The number is generated between 0 and 100");
      System.out.println(random_num);
      System.out.println("Now you have 5 tries to guess the number ");
      for(int i=1;i<=5;i++)
      {
         System.out.println("Please enter your guess");
         Scanner s=new Scanner(System.in);
         guess = s.nextInt();
         if(guess==random_num)
         {
            System.out.println("Congrtulations!\nYou Win");
            break;
         }
         else if(guess>random_num)
         {
            System.out.println("The number is too high");
         }
         else
         {
            System.out.println("The number is too low ");
         }
         System.out.println("You Lose");
         System.out.println("You have "+(5-i)+" tries left");
      }
   }   
}