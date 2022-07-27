package com.bridgelabz.TicTacToe;

import java.util.Scanner;

public class TicTacToe2 
{
	 public static void main(String[] args)
	 {
		 
		 
	       System.out.println("Welcome to TicTacToe on workshop platform");
	       char[] board = createBoard();
	       char playerLetter = chooseLetter();
	       char ComputerLetter;
	       if(playerLetter=='X')
             
	    	   ComputerLetter='O';

	       else
              ComputerLetter='X';

	       System.out.println(" Now the  Computer Letter is: " +ComputerLetter);
	       System.out.println(" Now the player Letter is: " +playerLetter);
	 }
	   public static char chooseLetter(){
	        char symbol;
	        Scanner UserInput = new Scanner(System.in);
	        System.out.print("Enter the symbol to allow the player to choose the symbol");
	        symbol=UserInput.next().toUpperCase().charAt(0);
	        return symbol;
	    }


	    public static char[] createBoard() {

	        char[] board = new char[10];
	        for(int index = 0; index < board.length; index++)
	        {
	            board[index] = ' ';
	        }
	        return  board;
	    }

}
	
		
