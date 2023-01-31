package Classes;

import Interfaces.Jump;

public class HighJump implements Jump{
    @Override
    public void jumping() {
        System.out.print("I am jumping high ");
    }
}
