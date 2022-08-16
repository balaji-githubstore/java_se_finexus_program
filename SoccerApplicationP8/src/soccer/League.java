/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer;

/**
 *
 * @author Administrator
 */
public class League {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		Team[] theTeams = League.createTeams();

		Game[] games = League.createGames(theTeams);

		Game currGame = games[0];

		//from previous project - start
		// goal 1 // first goal
		Goal goal1 = new Goal();
		goal1.thePlayer = currGame.homeTeam.playerArray[1];
		goal1.theTeam = currGame.homeTeam;
		goal1.theTime = 20;

		Goal[] goals = { goal1 };
		
		currGame.goals=goals;
		//from previous project - end
		
		System.out.println("Goal scored after " + currGame.goals[0].theTime + " mins by "
				+ currGame.goals[0].thePlayer.playerName + " of " + currGame.goals[0].theTeam.teamName);

	}

	/* Practice 8-1. Add new static method createTeams() here */
	public static Team[] createTeams() {
		// Create team1
		Player player1 = new Player();
		player1.playerName = "George Eliot";
		Player player2 = new Player();
		player2.playerName = "Graham Greene";
		Player player3 = new Player();
		player3.playerName = "Geoffrey Chaucer";
		Player[] thePlayers = { player1, player2, player3 };

		Team team1 = new Team();
		team1.teamName = "The Greens";
		team1.playerArray = thePlayers;

		// Create team2
		Team team2 = new Team();
		team2.teamName = "The Reds";
		team2.playerArray = new Player[3];
		team2.playerArray[0] = new Player();
		team2.playerArray[0].playerName = "Robert Service";
		team2.playerArray[1] = new Player();
		team2.playerArray[1].playerName = "Robbie Burns";
		team2.playerArray[2] = new Player();
		team2.playerArray[2].playerName = "Rafael Sabatini";

		Team[] theTeams = { team1, team2 };

		return theTeams;
	}

	/* Practice 8-1. Add new static method createGames() here */
	public static Game[] createGames(Team[] theTeams) {
		Game game = new Game();
		game.homeTeam = theTeams[0];
		game.awayTeam = theTeams[1];

		Game[] games = { game };

		return games;
	}
}
