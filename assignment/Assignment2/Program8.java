
interface Light {
    void switchOn();
}

interface Fan {
    void switchFan();
}

interface SmartHome extends Light, Fan {
    void showStatus();
}

class Home implements SmartHome {

    public void switchOn() {
        System.out.println("Light is ON");
    }

    public void switchFan() {
        System.out.println("Fan is ON");
    }

    public void showStatus() {
        System.out.println("Smart Home is active");
    }
}

public class Program8 {
    public static void main(String[] args) {

        Home h = new Home();

        h.switchOn();
        h.switchFan();
        h.showStatus();
    }
}