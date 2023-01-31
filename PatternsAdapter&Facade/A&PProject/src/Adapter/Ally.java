package Adapter;

public class Ally implements IAlly{
    @Override
    public void spell() {
        System.out.println("Va faill, Elaine");
    }

    @Override
    public void protection() {
        System.out.println("Защита");
    }
}
