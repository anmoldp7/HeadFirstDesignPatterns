package facade;

public class Projector {
    String description;
    StreamingPlayer streamingPlayer;

    public Projector(String description, StreamingPlayer streamingPlayer) {
        this.description = description;
        this.streamingPlayer = streamingPlayer;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void wideScreenMode() {
        System.out.println(description + " in widescreen mode (16x9 aspect ratio)");
    }

    public void tvMode() {
        System.out.println(description + " in tv mode (4x3 aspect ratio)");
    }

    public String toString() {
        return description;
    }
}
