package csci305.javalab;

public class LastPlayBot extends Player{
    public LastPlayBot(String name){
        super(name);
    }
    @Override
    public int play(){
        return Main.getLastPlay();
    }
}