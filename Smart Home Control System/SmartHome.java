import java.util.*;

public class SmartHome {
    private String ownerName;

    // Constructor
    public SmartHome(String ownerName) {
        this.ownerName = ownerName;
    }

    // ---------- Inner class: Light ----------
    public class Light {
        private boolean isOn;

        public void turnOn() {
            isOn = true;
            System.out.println("💡 Light is ON.");
        }

        public void turnOff() {
            isOn = false;
            System.out.println("💡 Light is OFF.");
        }

        public boolean isOn() {
            return isOn;
        }
    }

    // ---------- Inner class: Thermostat ----------
    public class Thermostat {
        private double temperature;

        public Thermostat(double temperature) {
            this.temperature = temperature;
        }

        public void setTemperature(double temp) {
            this.temperature = temp;
            System.out.println("🌡️ Temperature set to " + temp + "°C.");
        }

        public double getTemperature() {
            return temperature;
        }
    }

    // ---------- Static nested class: HomeInfo ----------
    public static class HomeInfo {
        private static String location = "Kigali, Rwanda";
        private static int deviceCount = 0;

        public static void showInfo() {
            System.out.println("📍 Home Location: " + location);
            System.out.println("🏠 Total Connected Devices: " + deviceCount);
        }

        public static void incrementDeviceCount() {
            deviceCount++;
        }
    }

    // ---------- Anonymous class usage ----------
    public void startTimer(int seconds, Runnable action) {
        new Thread(new Runnable() {  // Anonymous inner class
            public void run() {
                try {
                    Thread.sleep(seconds * 1000);
                    action.run();
                } catch (InterruptedException e) {
                    System.out.println("Timer interrupted!");
                }
            }
        }).start();
    }

    // ---------- Main test ----------
    public static void main(String[] args) {
        SmartHome home = new SmartHome("Edouard");
        SmartHome.HomeInfo.showInfo();

        // Create inner objects
        SmartHome.Light light = home.new Light();
        SmartHome.Thermostat thermostat = home.new Thermostat(24.0);

        // Use inner classes
        light.turnOn();
        SmartHome.HomeInfo.incrementDeviceCount();
        thermostat.setTemperature(22.5);
        SmartHome.HomeInfo.incrementDeviceCount();

        // Show updated info
        SmartHome.HomeInfo.showInfo();

        // Anonymous timer: Turn off light after 3 seconds
        home.startTimer(3, new Runnable() {
            public void run() {
                light.turnOff();
                System.out.println("⏰ Timer finished. Light turned off automatically.");
            }
        });

        // Keep program running for demo
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {}
    }
}
