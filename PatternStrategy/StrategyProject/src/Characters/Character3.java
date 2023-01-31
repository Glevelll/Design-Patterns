package Characters;

import Classes.Athlete;
import Classes.LongDistance;
import Classes.LongJump;

public class Character3 extends Athlete {
    public Character3(){
        run2 = new LongDistance();
        jump2 = new LongJump();
    };
    @Override
    public void display() {
        System.out.println("and my name is Gleb Kuznetsov");
    }
}
