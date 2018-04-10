package csci305.javalab;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

/*
    My Bot is kind of a satire. In "Do Androids Dream Of Electric Sheep?" (A.K.A. the book from which Bladerunner was adapted)
    There is a test given by humans to tell if a person is a human or a replicant (more human than human).
    I used the questions from the movie and made up most of the user responses

    In my class, a bot gives a test when playing against a human and semirandomly chooses moves based on the human's response

    There is a bulk of strings for user prompts. I tried to keep them in the inti_maps() method for clarity
*/
public class VKBot extends Player{
    //Structure to store the lengthy user prompts
    private final Map<Integer, String> questions = new HashMap<Integer, String>;
    public VKBot(String name){
        super(name);

    }
    @Override
    public int play() {
        int question_num = 1 + (new Random().nextInt(8));
        int move = null;
        if(Main.is_humans()) {
            System.out.println(questions.get(question_num));
            Scanner input_reader = new Scanner(System.in);
            boolean accepted = false;
            int response  = null;
            while (!accepted) {
                response = input_reader.nextInt();
                if (response > 0 && response < 4)
                    accepted = true;
                else
                    System.out.println("Invalid choice");
            }
            move = gen_qNa(question_num, response );

        }
        else{
            move = int question_num = 1 + (new Random().nextInt(5));
            }
        return move;
        }

    }
    //depending on the question asked and response received, generate a move from one of five
    //random move generators
    private int gen_qNa(int question, int response){
        int semi_random_a = (question +(question*response))%5 + 1;
        int semi_random_b = 1 + (new Random().nextInt(3));
        int[] choices;
        switch(semi_random_a){
            case 1 : choices = {1,3,5}
                    break;
            case 2 : choices = {2, 4, 1};
                    break;
            case 3:  choices = {3, 5, 2};
                    break;
            case 4:  choices = {4, 1,3};
                break;
            case 5:  choices = {5, 2, 4};
                break;
        return choices[semi_random_b]
        }

    }

    private void init_maps(){
        questions.put(1, "It’s your birthday. Someone gives you a calfskin wallet. What do you do:" +
                "\n1.) \"What kind of question is that?" +
                "\n2.) \"Calfskin is illegal. I bring the wallet to the police" +
                "\n3.) \"I accept it politely, but dispose of it when I get home");
        questions.put(2, "You’ve got a little boy. He shows you his butterfly collection plus the killing jar. What do you do:" +
                "\n1.) \"What is this?" +
                "\n2.) \"I take the boy to a doctor" +
                "\n3.) \"I ask the boy how much time he has spent on the collection");
        questions.put(3, "You’re in a desert walking along in the sand\n when all of the sudden you look down, and you see a tortoise, it’s crawling toward you. \nYou reach down, you flip the tortoise over on its back. The tortoise lays on its back, its belly baking in the hot sun,\n beating its legs trying to turn itself over, but it can’t, not without your help.\n But you’re not helping. Why is that?:" +
                "\n1.) \"Why am I not helping?!?!" +
                "\n2.) \"I stay and watch until the sunsets and walk when it's cooled." +
                "\n3.) \"I feel remorse and end the turtle's suffering");
        questions.put(4, "Describe in single words, only the good things that come into your mind about your mother." +
                "\n1.) \"I don't remember my mother... Why don't I remember my mother?!?!" +
                "\n2.) \"Kind, Caring, Patient" +
                "\n3.) \"Frugal, Witty, Loving");
        questions.put(5, "You're reading a magazine. You come across a full-page nude photo of a girl. You show it to your husband.\n He likes it so much, he hangs it on your bedroom wall.\nWhat do you do:" +
                "\n1.) \"I'm not married..." +
                "\n2.) \"I ask what he likes about the girl" +
                "\n3.) \"I let him know that it upsets me");
        questions.put(6, "You’re watching television. Suddenly you realize there’s a wasp crawling on your arm." +
                "\n1.) \"Beep Boop, does not compute" +
                "\n2.) \"I kill it quickly before it harms me" +
                "\n3.) \"I cautiously shoo it outside");
        questions.put(7, "You become pregnant by a man who runs off with your best friend, and you decide to get an abortion." +
                "\n1.) \"But, I'm a man..." +
                "\n2.) \"Was I not good enough for him?" +
                "\n3.) \"I use my health insurance");
        questions.put(8, "You're watching a stage play - a banquet is in progress. \nThe guests are enjoying an appetizer of raw oysters. The entree consists of boiled dog" +
                "\n1.) \"What breed of dog?" +
                "\n2.) \"What is the play about" +
                "\n3.) \"I leave the theater in disgust");


    }
}