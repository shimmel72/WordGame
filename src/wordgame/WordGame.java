
package wordgame;

import java.util.Scanner;
public class WordGame {

 
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean running = true;
        int guesses = 0;
        
        //String[] words = {"computer", "phone", "application"};
        Word[] words = {
            new Word("computer",    new String[]{"starts with a c, acer, dell, hp", "uses keyboard/mouse", "has a display"}),
            new Word("phone",       new String[]{"starts with a p, handheld", "can make calls", "you talk into it"}),
            new Word("application", new String[]{"starts with an, use these on your phone", "the second and third letters are both 'p'", "what you use on your smartphone"})
        };
        
        Word answer = words[(int)(Math.random()*words.length)];
        
        System.out.println("Enter a word: ");
        String wordGuess = input.nextLine();
        
        do
        {
            guesses++;
            
            if(!wordGuess.equals(answer.word))
            {
                System.out.println("Try again:");
                
                if(guesses % 5 == 0)
                    System.out.println(answer.getHint((guesses/5)-1));
                
                wordGuess = input.nextLine();
            }
            else
                running = false;
            
        }while(running);
        System.out.println("You got it! Number of guesses: " + guesses);
    }
}
