package csci305.javalab;
import java.util.Scanner;

public class Human extends Player{
    public Human(String name){
        super(name);
    }
    @Override
    public int play() {
        Scanner input_reader = new Scanner(System.in);
        boolean accepted = false;
        int choice = 1;
        while (!accepted) {
            System.out.println("(1) : Rock\n" +
                    "(2) : Paper\n" +
                    "(3) : Scissors\n" +
                    "(4) : Lizard\n" +
                    "(5) : Spock\n" +
                    "Enter your move:");
            choice = input_reader.nextInt();
            if (choice>0 && choice<6)
                accepted = true;
            else
                System.out.println("Invalid choice");
        }
        return choice;
    }
}