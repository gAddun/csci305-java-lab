package csci305.javalab;

import java.util.Random;

public class RandomBot extends Player{
    public RandomBot(String name){
        super(name);
    }
    @Override
    public int play(){
        int choice = 1 + (new Random().nextInt(5));
        return choice;
    }
}