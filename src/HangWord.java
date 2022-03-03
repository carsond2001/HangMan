import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangWord extends StickDraw {
	Random randGen = new Random();
	private static char BLANK;
	private static String Word;
	private static boolean first;
	private static String usedLetterBoard;
	private static String guess;
	private static char currentGuess;
	private ArrayList<String> wordList = new ArrayList<String>();
	private StickDraw stickDraw = new StickDraw();
	private Parts part = Parts.reset();
	/**
	 * constructor for HangWord, chooses the word and constructs the usedLetterBoard
	 * 
	 * @param stars symbol for usedLetterBoard
	 * @param lw    how many lives player gets
	 */
	public HangWord() {
		first = false;
		usedLetterBoard = "Used Letter Board: ";
		String string = "";
		for (int i = 0; i < Word.length(); i++) {

			string += BLANK;
		}
		usedLetterBoard = string;
	}
	/**
	 * Constructor for HangWord. Scans a user specified text file to create an ArrayList of words, wordList. Chooses a random word from wordList as the correct word. Adds characters to the usedLetterBoard.
	 * @param myBLANK sets the '*' character as the blank to be filled in for usedLetterBoard
	 * @param fileName file to be read into the ArrayList 
	 */
	public HangWord(char myBLANK, String fileName) {
		BLANK = myBLANK;
		File file = new File(fileName);
		{
			try {
				Scanner scan = new Scanner(file);
				while (scan.hasNext()) {
					String s = scan.next();
					wordList.add(s);
					System.out.println(wordList);
				}
				scan.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(myBLANK);
		Random r = new Random();
		int randomNumber = r.nextInt(wordList.size());
		System.out.println(wordList.get(randomNumber));
		String tempval = wordList.get(randomNumber);
		Word = tempval;
		usedLetterBoard = "Characters chosen so far: ";
		String string = "";
		for (int i = 0; i < Word.length(); i++) {

			string += BLANK;
		}
		guess = string;
	}
	/**
	 * Displays the most recent guess the user put in. If that guess is wrong, add a body part to the stick figure. 
	 */
	public void displayGuess() {
		if (first == true) {
			System.out.println("Current Guess: " + currentGuess);
			usedLetterBoard += currentGuess + ", ";
			if (!Word.contains(Character.toString(currentGuess))) {
				stickDraw.addBodyPart();

			}
		} else {
			first = true;
		}
		System.out.println(usedLetterBoard);
		System.out.println(guess+"hi");
		stickDraw.draw();

	}
	/**
	 * Updates the usedLetterBoard with the guess entered by the player
	 * 
	 * @param newGuess character entered by user
	 */
	public void updateWord(char newGuess) {
		currentGuess = newGuess;

		char[] correct_word = Word.toCharArray();
		char[] current_guess_array = guess.toCharArray();
		for (int i = 0; i < correct_word.length; i++) {
			if (correct_word[i] == newGuess) {
				current_guess_array[i] = currentGuess;
			}
		}
		String tempString = "";
		for (int i = 0; i < current_guess_array.length; i++) {
			tempString += current_guess_array[i];
		}
		guess = tempString;
	}
	/**
	 * Resets stickDraw if the player wins, and returns true. Otherwise false.
	 * 
	 * @return True if guess is equal to the correct word, otherwise return false
	 */
	public boolean win() {
		if (Word.equals(guess)) {
			System.out.println("YOU WIN!!!!!!!!!!!!! The correct word is " + Word);
			stickDraw.reset();
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Checks if the stick figure is fully drawn. If it is, print message telling the player they lost and the correct word. Otherwise false.
	 * 
	 * @return true if stick figure is drawn, false if not
	 */
	public boolean lose() {
		if (stickDraw.done() == true) {
			System.out.println("You lost, that kinda sucks...  The correct word was " + Word);
			this.part = Parts.reset();
			stickDraw.reset();
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Resets all instance variables to their original values. Clears the usedLetterBoard. Resets the stick figure. Picks a new random word if the users plays again.
	 */
	public void clear() {

		Random r = new Random();
		int randomNumber = r.nextInt(wordList.size());
		System.out.println(wordList.get(randomNumber));
		String tempval = wordList.get(randomNumber);
		Word = tempval;
		usedLetterBoard = "Characters chosen so far: ";
		String string = "";
		for (int i = 0; i < Word.length(); i++) {
			string += BLANK;
		}
		first = false;
		guess = string;
		currentGuess = Character.MIN_VALUE;
		part = Parts.reset();
		
	}
}
