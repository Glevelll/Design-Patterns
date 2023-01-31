package Classes;

import Characters.*;
import Interfaces.Jump;
import Interfaces.Run;
import Interfaces.ThrowAndPush;

public abstract class Athlete {
    protected Run run1;
    protected Run run2;
    protected Jump jump1;
    protected Jump jump2;
    protected ThrowAndPush throwandpush;
    public Athlete(){
    }
    public abstract void display();
    public void performRunSprint() {run1.running();}
    public void performRunLong() {run2.running();}
    public void performJumpHigh() {jump1.jumping();}
    public void performJumpLong() {jump2.jumping();}
    public void performThrowAndPush() {throwandpush.ThrowingAndPushing();}

    /*public static void Selection(Object object){
        if(object instanceof Character1){
            ((Character1) object).performRunSprint();
        }
        if(object instanceof Character2){
            ((Character2) object).performRunSprint();
        }
        if(object instanceof Character3){
            ((Character3) object).performRunSprint();
        }
        if(object instanceof Character4){
            ((Character4) object).performRunSprint();
        }
        if(object instanceof Character5){
            ((Character5) object).performRunSprint();
        }
        if(object instanceof Character6){
            ((Character6) object).performRunSprint();
        }
        if(object instanceof Character7){
            ((Character7) object).performRunSprint();
        }
    }*/
}
