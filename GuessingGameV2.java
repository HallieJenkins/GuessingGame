
/**
 * A game that challenges the user to guess a number in a range of their choice.
 *
 * Hallie Jenkins
 * October 18, 2019
 */
import java.util.Scanner;

public class GuessingGameV2
{
    public static void main(String[] args)
    {
       int guesscounter = 1;       
       Scanner HR = new Scanner(System.in);
       Scanner LR = new Scanner(System.in);
       System.out.println ("Choose a high number: ");
       double highRange = HR.nextInt();
       System.out.println ("Choose a low number: ");
       double lowRange = LR.nextInt();
       
       int randNum = (int)(Math.random() * (highRange - lowRange + 1) + lowRange); ;
       System.out.println("Guess a number between " + lowRange +" and "+ highRange);           
       Scanner in = new Scanner(System.in); 
       double guess = in.nextInt();
       
              
       
       while(guess != randNum)
       {          
           boolean high = randNum < guess;
           boolean low = randNum > guess;
           boolean correct = randNum == guess;
           
           if(high)
           {
               System.out.println("Enter your guess: " + guess);
               System.out.println("Too high! Try again.");
               guess = in.nextInt();
               
           }
          
           else if(low)
            {
               System.out.println("Enter your guess: " + guess);
               System.out.println("Too low! Try again.");
               guess = in.nextInt();
               
            }
          
           guesscounter++;
       }
       System.out.println(guess + " is correct! Great Job!");
       System.out.println("Number of guesses: "+ guesscounter);

           
           
        
        
    }
}
