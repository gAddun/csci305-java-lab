package csci305.javalab;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main{
    //laast_playes acessed by LastPlayBot()
    private static int last_played = 1;
    //has_humans accessed by VkBot()
    private static boolean has_humans = false;
    private static final Map<Integer, Element> moves = new HashMap<Integer, Element>();

    public static void main(String args[]){

        Scanner input_reader = new Scanner(System.in);
        Player p1 = null;
        Player p2 = null;
        int p1_score = 0;
        int p2_score = 0;

        //Initialize Hashmap
        Rock rock = new Rock("Rock");
        Paper paper = new Paper("Paper");
        Scissors scissors = new Scissors("Scissors");
        Lizard lizard = new Lizard("Lizard");
        Spock spock = new Spock("Spock");
        moves.put(1, rock);
        moves.put(2, paper);
        moves.put(3, scissors);
        moves.put(4, lizard);
        moves.put(5, spock);


        System.out.println(" Welcome to Rock, Paper, Scissors, Lizard, Spock, implemented by Giovany Addun");


        //Initialize players
        boolean accepted = false;
        int player1 = 0;
        int player2 = 0;
        System.out.println(" Please choose two players:\n" +
                "(1) Human\n" +
                "(2) StupidBot\n" +
                "(3) RandomBot\n" +
                "(4) IterativeBot\n" +
                "(5) LastPlayBot\n" +
                "(6) Voigt-Kampff Bot");

        //Loop for input of player 1
        while(!accepted){
            System.out.println("Choose player 1: ");
            player1 = input_reader.nextInt();
            if(player1>0 && player1<7)
                accepted = true;
            else
                System.out.println("Invalid selection");
        }
        accepted = false;

        //Loop for input of player 2
        while(!accepted){
            System.out.println("Choose player 2: ");
            player2 = input_reader.nextInt();
            if(player2>0 && player2<7)
                accepted = true;
            else
                System.out.println("Invalid selection");
        }
        int i = 0;

        //Loop to create each player based on user selection
        while (i<2){
            int choice;
            Player temp;
            if (i == 0)
                choice = player1;
            else
                choice = player2;
            switch(choice){
                case 1: temp = new Human("Human");
                        has_humans = true;
                    break;
                case 2: temp = new StupidBot("StupidBot");
                    break;
                case 3: temp = new RandomBot("RandomBot");
                    break;
                case 4: temp = new IterativeBot("IterativeBot");
                    break;
                case 5: temp = new LastPlayBot("LastPlayBot");
                    break;
                case 6: temp = new VKBot("Voigt-Kampff Bot");
                    break;
                default:temp = new Human("Human");
                        has_humans = true;
                    break;
            }
            if(i==0)
                p1 = temp;
            else
                p2 = temp;
            i++;
        }
        System.out.println(String.format("\n%s vs %s \n", p1.getName(), p2.getName()));

        //Check if player 1 is LastPlayBot
        boolean is_P1_LastPlayBot = false;
        if (p1.getName().equals("LastPlayBot"))
            is_P1_LastPlayBot = true;


        //Loop to play 5 rounds
        for(i = 0; i<5; i++){
            //Generate moves for each player
            int p1_mv =p1.play();
            Element e1 = moves.get(p1_mv);
            int p2_mv= p2.play();
            Element e2 = moves.get(p2_mv);
            System.out.println("Player 1 played " + e1.getName());
            System.out.println("Player 2 played " + e2.getName());

            //Update last play for LastPlayBot
            if (is_P1_LastPlayBot)
                last_played = p2_mv;
            else
                last_played = p1_mv;

            //Determine results
            String results = e1.compareTo(e2);
            //If the results contain "Player 1 wins"
            if (results.contains("1"))
                p1_score++;
            //If results contain "Player 2 wins"
            else if(results.contains("2"))
                p2_score++;
            //Print results
            System.out.println(results + "\n\n");
        }


        //Print and tally final results
        System.out.println(String.format("The score is %d to %d", p1_score, p2_score));
        String results;
        if(p1_score>p2_score)
            results = "Player 1 wins";
        else if (p2_score>p1_score)
            results = "Player 2 wins";
        else
            results = "Draw";
        System.out.println(results);

    }

    //Method to pass last played move to LastPlayBot
    public static int getLastPlay(){
        return last_played;
    }

    // Method used by VKBot to determine if the game has humans
    public static boolean is_humans(){
        return has_humans;
    }
}