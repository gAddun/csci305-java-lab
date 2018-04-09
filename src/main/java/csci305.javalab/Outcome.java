package csci305.javalab;
public class Outcome{
	//First string to return
	private String string1;
	//Second string to return
	private String string2;
	//Holds different strings representing all combinations of moves for 2 players
	private final String[]plays = {"Scissors cut Paper", "Paper covers Rock",
			"Rock crushes Lizard", "Lizard poisons Spock", "Spock smashes Scissors",
			"Scissors decapitate Lizard", "Lizard eats Paper", "Paper disproves Spock",
			"Spock vaporizes Rock", "Rock crushes Scissors" };
	//Holds contents of string2
	private final String[] outcomes = {"Player 1 wins", "Player 1 loses"};

	//Constructor for Outcome object
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
		String tmp_string1 = "";
		String tmp_string2 = "";
		switch(e1) {
			case "Rock":
				if (e2.equals("Paper")){
					tmp_string1 = plays[1];
					tmp_string2 = outcomes[1];
				}
				else if (e2.equals("Scissors")){
					tmp_string1 = plays[9];
					tmp_string2 = outcomes[0];
				}
				else if (e2.equals("Lizard")){
					tmp_string1 = plays[2];
					tmp_string2 = outcomes[0];
				}
				else if (e2.equals("Spock")){
					tmp_string1 = plays[8];
					tmp_string2 = outcomes[1];
				}
				break;
			case "Paper":
				if (e2.equals("Rock")){
					tmp_string1 = plays[1];
					tmp_string2 = outcomes[0];
				}
				else if (e2.equals("Scissors")){
					tmp_string1 = plays[0];
					tmp_string2 = outcomes[1];
				}
				else if (e2.equals("Lizard")){
					tmp_string1 = plays[6];
					tmp_string2 = outcomes[1];
				}
				else if (e2.equals("Spock")){
					tmp_string1 = plays[7];
					tmp_string2 = outcomes[0];
				}
				break;
			case "Scissors":
				if (e2.equals("Rock")){
					tmp_string1 = plays[9];
					tmp_string2 = outcomes[1];
				}
				else if (e2.equals("Paper")){
					tmp_string1 = plays[0];
					tmp_string2 = outcomes[0];
				}
				else if (e2.equals("Lizard")){
					tmp_string1 = plays[5];
					tmp_string2 = outcomes[0];
				}
				else if (e2.equals("Spock")){
					tmp_string1 = plays[4];
					tmp_string2 = outcomes[1];
				}
				break;


			case "Lizard":
				if (e2.equals("Rock")){
					tmp_string1 = plays[2];
					tmp_string2 = outcomes[1];
				}
				else if (e2.equals("Paper")){
					tmp_string1 = plays[6];
					tmp_string2 = outcomes[0];
				}
				else if (e2.equals("Scissors")){
					tmp_string1 = plays[5];
					tmp_string2 = outcomes[1];
				}
				else if (e2.equals("Spock")){
					tmp_string1 = plays[3];
					tmp_string2 = outcomes[0];
				}
				break;
			case "Spock":
				if (e2.equals("Rock")){
					tmp_string1 = plays[8];
					tmp_string2 = outcomes[0];
				}
				else if (e2.equals("Paper")){
					tmp_string1 = plays[7];
					tmp_string2 = outcomes[1];
				}
				else if (e2.equals("Scissors")){
					tmp_string1 = plays[4];
					tmp_string2 = outcomes[0];
				}
				else if (e2.equals("Lizard")){
					tmp_string1 = plays[3];
					tmp_string2 = outcomes[1];
				}
				break;
			default:
				break;
		}
		if(mod == 0 )
			return tmp_string1;
		else
			return tmp_string2;
	}

	public String getString1(){
		return this.string1;
	}

	public String getString2(){
		return this.string2;
	}
}