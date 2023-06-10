package command;

public class Light {
    String name;
    private boolean isOn;

    public Light(String name) {
        this.name = name;
        isOn = false;
    }

    public String toString() {
        return "Light " + name;
    }

    public void on() {
        isOn = true;
        System.out.println(name + " light is turned on!");
    }

    public void off() {
        isOn = false;
        System.out.println(name + " light is switched off!");
    }

    public boolean checkIfOn() {
        return isOn;
    }
}
