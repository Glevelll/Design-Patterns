package Adapter;

import org.jetbrains.annotations.NotNull;

public class Main {
    public static void main(String[] args) {
        IHero hero = new Hero();
        IAlly ally = new Ally();
        IHero allyAdapter = new Adapterrr(ally);
        System.out.println("Союзник помогает:");
        ally.spell();
        ally.protection();
        System.out.println("Герой делает:");
        testHero(hero);
        System.out.println("Адаптированный союзник помогает:");
        testHero(allyAdapter);
    }
    static void testHero(@NotNull IHero iHero) {
        iHero.attack();
        iHero.dodge();
    }
}