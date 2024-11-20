public class task28 {
    public boolean isOn = false;
    
    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void status() {
        System.out.println(this.isOn ? "On" : "Off");
    }

    public static void main(String[] args) {
        task28 lamp1 = new task28();
        task28 lamp2 = new task28();
        lamp1.turnOn();
        lamp2.turnOff();
        lamp1.status();
        lamp2.status();
    }
}
