package command;

public class GarageDoor {
    private String name;
    private boolean isClosed;
    private Light light;

    public GarageDoor(String name) {
        this.name = name;
        light = new Light("Garage Door");
        isClosed = true;
    }

    public void lightOn() {
        light.on();
    }

    public void lightOff() {
        light.off();
    }

    public boolean isLightOn() {
        return light.checkIfOn();
    }

    public void up() {
        isClosed = false;
        System.out.println(name + " garage door is open!");
    }

    public void down() {
        isClosed = true;
        System.out.println(name + " garage door is closed!");
    }

    public boolean closed() {
        return isClosed;
    }
}
