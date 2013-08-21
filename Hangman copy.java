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


public class Hangman extends ConsoleProgram {

    public void run() {
		/* You fill this in */
		setupGame();
		playGame();
	}

	private void setupGame() {
		lexicon  = nee HangmanLexicon();
		println("Welcome to Hangman!");
		getWord();
	}
	private void getWord() {
		//generate a random number

	}

}
