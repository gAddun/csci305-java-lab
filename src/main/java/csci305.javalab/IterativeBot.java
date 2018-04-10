package csci305.javalab;

public class IterativeBot extends Player{
    private int iteration = 1;
    public IterativeBot(String name){
        super(name);
    }
    @Override
    public int play(){
        if (this.iteration <5)
                this.iteration++;
        else
            this.iteration = 1;
        return this.iteration;
    }
}