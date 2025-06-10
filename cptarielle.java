import arc.*;

public class cptarielle{
	public static void main(String args[]){
		Console con = new Console();
		con.println("Hello");
		
		String strMenu = " ";
		//Format of question
		//Question - String
		//Choices - String
		//Answer - String
		String strQ;
		String strC;
		String strA;
		
		//Menu Items
		con.println("(P)lay Game - 1");
		con.println("(L)eaderboard - 2");
		con.println("(A)dd Quiz - 3");
		con.println("(Q)uit - 4");
		strMenu = con.readLine();

		
		//The If statement is to Quit
		if(strMenu.equalsIgnoreCase("Q")) {
			con.closeConsole();
		}
		
		//To play the game
		if(strMenu.equalsIgnoreCase("P")) {
		//Opening quizzes.txt
		//Opening this file shows all quizzes availible
		TextInputFile quizzes = new TextInputFile("quizzes.txt");
		while(quizzes.eof() != true){
		}
	}

				

	}
}	
