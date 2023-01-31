package Characters;

import Classes.*;

public class Character1 extends Athlete {
    public Character1(){
        run1 = new Sprint();
        run2 = new LongDistance();
    };
    @Override
    public void display() {
        System.out.println("and my name is Ivan Petrov");
    }
}
