package Characters;

import Classes.Athlete;
import Classes.Sprint;

public class Character2 extends Athlete {
    public Character2(){
        run1 = new Sprint();
    };
    @Override
    public void display() {
        System.out.println("and my name is Petr Ivanov");
    }
}
