package Part3;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        StreamingPlayer dvd = new StreamingPlayer();
        Projector cd = new Projector();
        Screen projector = new Screen();
        TheaterLights screen = new TheaterLights();
        PopcornPopper lights = new PopcornPopper();
        Object popper = new Object();
        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}
