package facade;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    StreamingPlayer streamingPlayer;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(
        Amplifier amp,
        CdPlayer cd,
        Tuner tuner,
        StreamingPlayer streamingPlayer,
        Projector projector,
        Screen screen,
        TheaterLights lights,
        PopcornPopper popper) {
            this.amp = amp;
            this.cd = cd;
            this.tuner = tuner;
            this.streamingPlayer = streamingPlayer;
            this.projector = projector;
            this.screen = screen;
            this.lights = lights;
            this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setStreamingPlayer(streamingPlayer);
        amp.setSurroundSound();
        amp.setVolume(5);
        streamingPlayer.on();
        streamingPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        streamingPlayer.stop();
        streamingPlayer.off();
    }

    public void listenToRadio(double frequency) {
        System.out.println("Tuning in to airwaves...");
        tuner.on();
        tuner.setFrequency(frequency);
        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);
    }

    public void endRadio() {
        System.out.println("Shutting down the tuner...");
        tuner.off();
        amp.off();
    }
}
