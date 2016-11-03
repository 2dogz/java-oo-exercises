
public class BaseballPlayer {
	private String Name;
	private Integer Number;
	private String Bats;
	private Integer CompleteGames;
	private Integer Game;
		private Integer Hits;
		private Integer RBI;
	
	public BaseballPlayer(String Name, Integer Number, String Bats,Integer CompleteGames, Integer Game, Integer Hits, Integer RBI){
		this.Name = Name;
		this.Number = Number;
		this.Bats = Bats;
		this.CompleteGames = CompleteGames;
		this.Game = Game;
		this.Hits = Hits;
		this.RBI = RBI;
	}
	
	public String getName(){
		return this.Name;
	}
	public Integer getNumber(){
		return this.Number;
	}
	public String getBats(){
		return this.Bats;
	}
	public Integer getCompleteGames(){
		return this.CompleteGames;
	}
	public Integer getGame(){
		return this.Game;
	}
		public Integer getHits(){
			return this.Hits;
	}
		public Integer getRBI(){
			return this.RBI;
	}
		
		public String toString(){
			return "Name = " + this.Name + 
					" Players' Number = " + this.Number + 
					" Player Bats: " + this.Bats +
					" Player has Completed " + this.CompleteGames + 
					" Games this year " + "In this specific game, Game # " + this.Game +" " + this.Name + " got " + this.Hits + " Hits & " + this.RBI + " RBIs";
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseballPlayer my_player = new BaseballPlayer ("Webb", 58,"switch", 1, 1, 3, 5);
		System.out.println(my_player.getName());
		System.out.println(my_player.getNumber());
		System.out.println(my_player.getBats());
		System.out.println(my_player.getCompleteGames());
		System.out.println(my_player.getGame());
		System.out.println(my_player.getHits());
		System.out.println(my_player.getRBI());
		System.out.println(my_player.toString());
		
	}

}
