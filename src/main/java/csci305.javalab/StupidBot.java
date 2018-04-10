package csci305.javalab;

public class StupidBot extends Player{
    public StupidBot(String name){
        super(name);
    }
    @Override
    public int play(){
        return 1;
    }
}