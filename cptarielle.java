import arc.*;

public class cptarielle{
	public static void main(String args[]){
		Console con = new Console();
		//Arielle Lor
		//Multiple Choice Game
		//2025-06-12
		//Version 7.05
		
		con.println("Multiple Choice");
		String strMenu = " ";
		String strQuizzes;
		String strQuizName;
		String strName;
		String strG;
		String strS;
		String strYes;
		String strNo;
		//Menu Items
		String strP;
		String strL;
		String strAdd;
		String strQuit;
		//Format of question
		//Question - String
		//Choices - String
		//Answer - String
		String strQ;
		String strC;
		String strCh;
		String strA;
		
		//Menu Items
		con.println("(P)lay Game");
		con.println("(L)eaderboard");
		con.println("(A)dd Quiz");
		con.println("(Q)uit");
		strMenu = con.readLine();

			//Quit
			if(strMenu.equalsIgnoreCase("Q")) {
				//Closes the window
				con.closeConsole();
			}
			
			//To play the game
			if(strMenu.equalsIgnoreCase("P")) {
			//Clears the screen
				con.clear();
				con.println("What is your name?");
				strName = con.readLine();
			TextOutputFile Names = new TextOutputFile("Names.txt");				
				con.clear();
				con.println("Quizzes: ");
			//Opening quizzes.txt
			//Opening this file shows all quizzes availible
			TextInputFile Quizzes = new TextInputFile("quizzes.txt");
			while(Quizzes.eof() != true){
			strQuizzes = Quizzes.readLine();
			con.println(""+strQuizzes);

			}
			strQuizzes = con.readLine();
			Quizzes.close();

			//Opeing up Geography quiz
			if(strMenu.equalsIgnoreCase("G")) {	
			con.clear();
			TextInputFile Geo = new TextInputFile("Geography.txt");
			while(Geo.eof() != true){
				Geo.close();
		}
		}
		}
			
			//Leaderboard
			if(strMenu.equalsIgnoreCase("L")) {	
				con.clear();
			TextOutputFile Leaderboard = new TextOutputFile("Leaderboard.txt");

			}
			
			//Add Quiz
			if(strMenu.equalsIgnoreCase("A")) {	
				con.clear();
			TextInputFile Quizzes = new TextInputFile("quizzes.txt");
			while(Quizzes.eof() != true){
			strQuizzes = Quizzes.readLine();
			con.println(""+strQuizzes);

		}
		con.println("Name of quiz:");
		strQuizzes = con.readLine();
		Quizzes.close();
		TextOutputFile Quiz = new TextOutputFile("New Quiz.txt");
		con.clear();
		con.println("Enter question");
		con.println("Answer");
		con.println("Answer");
		con.println("Answer");
		con.println("Answer");
		con.println("The actual answer");

			}
				
				

	}
}	
