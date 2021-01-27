package _29_12_02020_IOStream;

public class Player {

	private String PlayerName;
	private String Country;
	private double totalRuns;
	private  double highestScore;
	public String getPlayerName() {
		return PlayerName;
	}
	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public double getTotalRuns() {
		return totalRuns;
	}
	public void setTotalRuns(double totalRuns) {
		this.totalRuns = totalRuns;
	}
	public double getHighestScore() {
		return highestScore;
	}
	public void setHighestScore(double highestScore) {
		this.highestScore = highestScore;
	}
	public Player(String playerName, String country, double totalRuns, double highestScore) {
		super();
		PlayerName = playerName;
		Country = country;
		this.totalRuns = totalRuns;
		this.highestScore = highestScore;
	}
	public Player() {
		
	}
	@Override
	public String toString() {
		return "PlayerName=" + PlayerName + ", Country=" + Country + ", totalRuns=" + totalRuns
				+ ", highestScore=" + highestScore+" ";
	}
	
	
}
