package command;

public class Stereo {
    String location;
    int volume;

    public Stereo(String location) {
        this.location = location;
        this.volume = 0;
    }

    public void on() {
        System.out.println(location + " stereo is on!");
    }

    public void off() {
        System.out.println(location + " stereo is off!");
    }

    public void setCD() {
        System.out.println(location + " stereo is set for CD input!");
    }

    public void setDVD() {
        System.out.println(location + " stereo is set for DVD input!");
    }

    public void setRadio() {
        System.out.println(location + " stereo is set for radio!");
    }

    public void setVolume(int volume) {
        System.out.println(location + " stereo volume is set to " + volume);
        this.volume = volume;
    }
}
