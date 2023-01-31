import Restaurant.*;

public class Main {
    public static void main(String[] args) {
        Shawarma shawarma1 = new Classics();
        System.out.println(shawarma1.getName()
                + shawarma1.cost() + " Р");
        Shawarma shawarma2 = new Cheesy();
        shawarma2 = new Cheese(shawarma2);
        shawarma2 = new Potatoes(shawarma2);
        System.out.println(shawarma2.getName()
                + shawarma2.cost() + " Р");
        Shawarma shawarma3 = new Classics();
        shawarma3 = new Tomatoes(shawarma3);
        shawarma3 = new Cheese(shawarma2);
        shawarma3 = new Onion(shawarma3);
        System.out.println(shawarma3.getName()
                + shawarma3.cost() + " Р");
    }
}