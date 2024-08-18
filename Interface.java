import java.util.ArrayList;
import java.util.List;

// Define the Device interface
interface Device {
    void turnOn();
    void turnOff();
    boolean isOn();
}

// Implement the Device interface with different classes

class Light implements Device {
    private boolean on = false;
    
    @Override
    public void turnOn() {
        on = true;
        System.out.println("Light is turned on.");
    }
    
    @Override
    public void turnOff() {
        on = false;
        System.out.println("Light is turned off.");
    }
    
    @Override
    public boolean isOn() {
        return on;
    }
}

class Fan implements Device {
    private boolean on = false;
    
    @Override
    public void turnOn() {
        on = true;
        System.out.println("Fan is turned on.");
    }
    
    @Override
    public void turnOff() {
        on = false;
        System.out.println("Fan is turned off.");
    }
    
    @Override
    public boolean isOn() {
        return on;
    }
}

// Control the devices using the Device interface

class HomeAutomationSystem {
    private List<Device> devices = new ArrayList<>();
    
    public void addDevice(Device device) {
        devices.add(device);
    }
    
    public void turnAllOn() {
        for (Device device : devices) {
            device.turnOn();
        }
    }
    
    public void turnAllOff() {
        for (Device device : devices) {
            device.turnOff();
        }
    }
}

public class Interface {
    public static void main(String[] args) {
        Device light = new Light();
        Device fan = new Fan();
        
        HomeAutomationSystem system = new HomeAutomationSystem();
        system.addDevice(light);
        system.addDevice(fan);
        
        system.turnAllOn();  // Turns on all devices
        system.turnAllOff(); // Turns off all devices
        light.turnOn();      // Tuens on only light
    }
}
