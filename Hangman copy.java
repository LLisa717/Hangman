/*
 * File: Hangman.java
 * ------------------
 * This program will eventually play the Hangman game from
 * Assignment #4.
 */



import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.awt.*;
import java.util.Random;

private HangmanLexicon lexicon;
private String word;
private int guessRemaining;
private String guessLetter;




public class Hangman extends ConsoleProgram {

    public void run() {
		/* You fill this in */
		setupGame();
		playGame();
	}

	private void setupGame() {
		lexicon  = new HangmanLexicon();
		println("Welcome to Hangman!");
		
	}

	private playGame() {
		getWord();
		guessRemaining = Num_Guesses;
		while (true) {
			println("The word now looks like: " + workingString());
			printNumGuesse();
			String guessline = getGuesses();
			if (guessline.equalIgnoreCase(word)){
				printWinMsg();
				break;

			}
			checkGuess(guessline);
			if (guessRemaining == 0 | guessRemaining < 0) {
				printLossMsg();
				break;
			} 
		}

	}

	private int getGuesses() {

	}
	private boolean checkGuess(String) {

	}

	private void getWord() {
		//generate a random number
		word
	}

	private void printWinMsg() {

	}
	private void printLossMsg() {

	}

}
