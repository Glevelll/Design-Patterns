package Characters;

import Classes.Athlete;
import Classes.ThrAndPush;

public class Character5 extends Athlete {
    public Character5(){
        throwandpush = new ThrAndPush();
    };
    @Override
    public void display() {
        System.out.println("and my name is Vasily Sobolev");
    }
}
