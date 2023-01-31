package Characters;

import Classes.Athlete;
import Classes.HighJump;
import Classes.LongJump;

public class Character4 extends Athlete {
    public Character4(){
        jump1 = new HighJump();
        jump2 = new LongJump();
    };
    @Override
    public void display() {
        System.out.println("and my name is Oleg Glebov");
    }
}
