/*
    ---------INSTRUCTIONS---------------
    1.Enter your guess
    2.See if your guess is too high or too low
    3.Change your guess
    4.See how many turns it takes you to win!
    
 */
import java.util.Scanner;
import java.util.Random;

class Main{
    public static void main(String[] args)
    {  
       Scanner sc=new Scanner(System.in);
       String play="yes";

       while(play.equals("yes"))
       {
        Random random=new Random();
        int secretNum = random.nextInt(100);
        int guess=-1;
        int attempts=0;
        
        while(guess != secretNum)
        {
            System.out.print("Pick a number between 1 and 100: ");
            guess = sc.nextInt();
            attempts++;
            if(guess == secretNum)
            {
              System.out.println("Well Done! you guessed the number! ");
              System.out.println("It only took you "+ attempts + " attempts to guess this number");
              System.out.print("Would you like to play again? Yes or No: ");
              play = sc.next().toLowerCase();
            }
            else if(guess > secretNum)
            {
                System.out.println("Your guess is too high,try again.");
            }
            else
            {
                 System.out.println("Your guess is too low,try again.");
            }

        
        }
       }
       System.out.println("Thanks for playing...");
       sc.close();
    }

}
    
