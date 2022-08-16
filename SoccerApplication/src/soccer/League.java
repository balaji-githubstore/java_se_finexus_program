package soccer;

public class League {

	public static void main(String[] args) {

		// team 1
		Player player1 = new Player();
		player1.playerName = "George Elliot";

		Player player2 = new Player();
		player2.playerName = "Graham Greene";

		Player player3 = new Player();
		player3.playerName = "Geoffrey Chaucer";

		// create playerarray and add it to players
//		Player[] playerArray=new Player[3];
//		playerArray[0]=player1;
//		playerArray[1]=player2;
//		playerArray[2]=player3;

		Player[] playerArray = { player1, player2, player3 };

		Team team1 = new Team();
		team1.teamName = "The Greens";
		team1.playerArray = playerArray;

		//player1.playerName="Robert Service";
		
		for(Player player : team1.playerArray)
		{
			System.out.println(player.playerName);
		}
		
		
		//team2
		Team team2=new Team();
		team2.teamName="The Reds";
		team2.playerArray=new Player[3];
		
		team2.playerArray[0]=new Player();
		team2.playerArray[0].playerName="Robert Service";
		
		team2.playerArray[1]=new Player();
		team2.playerArray[1].playerName="Robbie Burns";
		
		team2.playerArray[2]=new Player();
		team2.playerArray[2].playerName="Rafeal Sabatani";
		
		
		for(Player player : team2.playerArray)
		{
			System.out.println(player.playerName);
		}
		
		//create game
		Game game=new Game();
		game.homeTeam=team1;
		game.awayTeam=team2;
		
		//goal 1 // first goal
		Goal goal1=new Goal();
		goal1.thePlayer=game.homeTeam.playerArray[1];
		goal1.theTeam=game.homeTeam;
		goal1.theTime=20;
		
		//goal 2 //second goal
		Goal goal2=new Goal();
		goal2.thePlayer=game.homeTeam.playerArray[2];
		goal2.theTeam=game.homeTeam;
		goal2.theTime=40;
		
		Goal[] goals= {goal1,goal2};
		
		game.goals= goals;
		
		
		System.out.println("Goal scored after "+game.goals[0].theTime+" mins by "+game.goals[0].thePlayer.playerName+" of "+game.goals[0].theTeam.teamName);
		
		System.out.println("Goal scored after "+game.goals[1].theTime+" mins by "+game.goals[1].thePlayer.playerName+" of "+game.goals[1].theTeam.teamName);
		
		
		
	}
	
	

}
