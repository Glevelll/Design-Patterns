import Characters.*;
import Classes.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ArrayList team = new ArrayList();
        Athlete athlete1 = new Character1();
        Athlete athlete2 = new Character2();
        Athlete athlete3 = new Character3();
        Athlete athlete4 = new Character4();
        Athlete athlete5 = new Character5();
        Athlete athlete6 = new Character6();
        Athlete athlete7 = new Character7();

//        team.add(athlete1);
//        team.add(athlete2);
//        team.add(athlete3);
//        team.add(athlete4);
//        team.add(athlete5);
//        team.add(athlete6);
//        team.add(athlete7);
//
//        for (Object e : team){
//            Athlete.Selection(e);
//        }

        athlete1.performRunSprint();
        athlete1.performRunLong();
        athlete1.display();
        athlete2.performRunSprint();
        athlete2.display();
        athlete3.performRunLong();
        athlete3.performJumpLong();
        athlete3.display();
        athlete4.performJumpHigh();
        athlete4.performJumpLong();
        athlete4.display();
        athlete5.performThrowAndPush();
        athlete5.display();
        athlete6.performRunSprint();
        athlete6.display();
        athlete7.performRunSprint();
        athlete7.performJumpHigh();
        athlete7.display();
    }
}