package facade;

public class Amplifier {
    String description;
    Tuner tuner;
    StreamingPlayer streamingPlayer;
    int volume;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void setStereoSound() {
        System.out.println(description + " stereo mode on");
    }

    public void setSurroundSound() {
        System.out.println(description + " surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int volume) {
        System.out.println(description + " setting volume to " + volume);
        this.volume = volume;
    }

    public void setTuner(Tuner tuner) {
        System.out.println(description + " setting tuner to " + tuner);
        this.tuner = tuner;
    }

    public void setStreamingPlayer(StreamingPlayer streamingPlayer) {
        System.out.println(description + " setting streaming player to " + streamingPlayer);
        this.streamingPlayer = streamingPlayer;
    }

    public String toString() {
        return description;
    }
}
