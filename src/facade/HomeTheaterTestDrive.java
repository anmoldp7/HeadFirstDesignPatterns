package facade;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Amplifier");
        Tuner tuner = new Tuner("AM/FM tuner", amp);
        StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
        CdPlayer cdPlayer = new CdPlayer("CD Player", amp);
        Projector projector = new Projector("Projector", player);
        TheaterLights theaterLights = new TheaterLights("Theater ceiling lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
            amp,
            cdPlayer,
            tuner,
            player,
            projector,
            screen,
            theaterLights,
            popper);

        homeTheater.watchMovie("Fight Club");
        homeTheater.endMovie();
    }
}
