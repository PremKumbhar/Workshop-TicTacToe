package com.bridgelabz.TicTacToe;

public class TicTacToe {

		char[] board =new char [10];
		public void Board()
		{
			for (int i=1;i<board.length;i++)
			{
				board[i]='';
			}
		}
		public static void main(String[]args)
		{
			TicTacToe obj=new TicTacToe();
			obj.Board();
			System.out.println("Adding Tic Tac Toe game on board");
		
		
		

	}

}
