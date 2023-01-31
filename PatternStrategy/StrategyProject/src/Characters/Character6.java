package Characters;

import Classes.Athlete;
import Classes.Sprint;

public class Character6 extends Athlete {
    public Character6(){
        run1 = new Sprint();
    };
    @Override
    public void display() {
        System.out.println("and my name is Igor Lunev");
    }
}
