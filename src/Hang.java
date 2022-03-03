import java.util.Random;
import java.util.Scanner;

/**
 * Plays the game of Hangman
 * @author Lynn Lambert
 *
 */
public class Hang {
    /**
     * Returns a lowercase version of a user-entered letter 
     * @param kbd input stream from which the letter is read
     * @return a lowercase version of a user-entered letter 
     */
    public static char getNewGuess(Scanner kbd)
    {
	char newchar='?';
	System.out.print( "Enter your new guess> ");
	while (!Character.isLetter(newchar))
	    {
		newchar = kbd.next().charAt(0);
		if (!Character.isLetter(newchar)) {
		    System.out.print( "Your character must be a letter.  Please enter again> ");
		}
	    }
	return Character.toLowerCase(newchar);
    }
	
    public static void main(String[] args) { 
    	  	
    	char newGuess;     
    	Scanner kbd = new Scanner(System.in);
    	System.out.print("Enter the file to read words from-> ");
    	String fileName = kbd.next();
    	HangWord game = new HangWord('*',fileName);  
    	boolean done = false;
    	while (!done) {
    		boolean gameOver = false;
    		while (!gameOver)
    		{
    			game.displayGuess();
    			newGuess = getNewGuess(kbd);
    			game.updateWord(newGuess);
    			gameOver = game.win() || game.lose();
    		}
    		System.out.print("Do you want to play again (Y/N) => ");
    		char answer = kbd.next().toLowerCase().charAt(0);
    		if (answer == 'y') {
    			game.clear();
    		}
    		else {
    			done = true;
    		}
    	}
    }

}
