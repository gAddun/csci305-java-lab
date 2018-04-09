public class Outcome{
	private String string1;
	private String string2;
	private final String[]plays = {"Scissors cut Paper", "Paper covers Rock",
			"Rock crushes Lizard", "Lizard poisons Spock", "Spock smashes Scissors",
			"Scissors decapitate Lizard", "Lizard eats Paper", "Paper disproves Spock",
			"Spock vaporizes Rock", "Rock crushes Scissors" };
	public Outcome(String e1, String e2){
		if (e1.equals(e2)){
			string1 = (e1 + " equals " + e2);
			string2 = "Tie";
		}
		else{
			string1 = this.getPlay(e1, e2, 0);
			string2 = this.getPlay(e1, e2, 1);
		}
	}
	
	public String getPlay(String e1, String e2, int mod){
		String tmp_string1;
		String tmp_string2;
		switch(e1) {
			case "Rock":
				if (e2.equals("Paper"))
		}
	}
}