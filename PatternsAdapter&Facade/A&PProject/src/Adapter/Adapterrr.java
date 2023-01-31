package Adapter;

import java.util.Random;

class Adapterrr implements IHero {
        IAlly ally;
        public Adapterrr(IAlly ally) {
            this.ally = ally;
        }

    @Override
    public void attack() {
        ally.spell();
    }

    @Override
    public void dodge() {
     ally.protection();
    }
}
