package Facade;

public class Music {
    public void on() {
        System.out.println("Музыка включена");
    }
    public void setVolume(int i) {
        System.out.println("Громкость музыки " + i + "%");
    }
    public void off() {
        System.out.println("Музыка выключена");
    }
}
