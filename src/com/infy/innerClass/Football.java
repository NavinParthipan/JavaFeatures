package com.infy.innerClass;

public class Football {
	private String leagueName = "Laliga",coachName = "Carlo Ancelotti";
	
	class Player{
		private String playerName = "Karim Benzema";
		private int jerseyNumber = 9;
		
		public void displayLeague() {
			System.out.println(leagueName);
		}
		public void displayCoach() {
			System.out.println(coachName);
		}
	}
	public void displayDetails() {
		Player player = new Player();
		player.displayLeague();
		player.displayCoach();
		System.out.println(player.playerName);
		System.out.println(player.jerseyNumber);
	}
	

	public static void main(String[] args) {
		Football football = new Football();
		football.displayDetails();
	}

}
