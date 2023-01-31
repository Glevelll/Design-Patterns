package Characters;

import Classes.Athlete;
import Classes.HighJump;
import Classes.Sprint;
import Interfaces.ThrowAndPush;

public class Character7 extends Athlete {
    public Character7(){
        jump1 = new HighJump();
        run1 = new Sprint();
    };
    @Override
    public void display() {
        System.out.println("and my name is Sergey Shirov");
    }
}
