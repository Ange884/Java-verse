import java.util.*;
import  java.util.Scanner;

abstract class Appliance {
    private String name;
    private boolean isOn;
    private double powerUsage;
    private double hoursUsed;

    public Appliance(String name, double powerUsage) {
        this.name = name;
        this.powerUsage = powerUsage;
        this.isOn = false;
        this.hoursUsed = 0;
    }

    public String getName() { return name; }
    public boolean isOn() { return isOn; }
    public double getPowerUsage() { return powerUsage; }

    public void turnOn() {
        isOn = true;
        System.out.println(name + " is turned ON!");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " is turned OFF!");
    }

    public void useFor(double hours) {
        if (isOn) {
            hoursUsed += hours;
            System.out.println(getName() + " used for " + hours + " hours.");
        } else {
            System.out.println(getName() + " is OFF, no power used.");
        }
    }

    public double getTotalPowerConsumption() {
        return hoursUsed * powerUsage;
    }

    public void scheduleTurnOn(int hour) {
        System.out.println(getName() + " scheduled to turn ON at " + hour + ":00.");
    }

    public void scheduleTurnOff(int hour) {
        System.out.println(getName() + " scheduled to turn OFF at " + hour + ":00.");
    }

    public void voiceCommand(String command) {
        switch (command.toLowerCase()) {
            case "on": turnOn(); break;
            case "off": turnOff(); break;
            default: System.out.println("Unknown command for " + getName());
        }
    }

    public abstract void performFunction();
}

class Light extends Appliance {
    private int brightness;

    public Light(String name, double powerUsage) {
        super(name, powerUsage);
        this.brightness = 50;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
        System.out.println(getName() + " brightness set to " + brightness + "%");
    }

    @Override
    public void performFunction() {
        if (isOn()) {
            System.out.println(getName() + " is glowing at " + brightness + "% brightness");
        } else {
            System.out.println(getName() + " is OFF.");
        }
    }
}

class Fan extends Appliance {
    private int speed;

    public Fan(String name, double powerUsage) {
        super(name, powerUsage);
        this.speed = 1;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println(getName() + " speed set to " + speed);
    }

    @Override
    public void performFunction() {
        if (isOn()) {
            System.out.println(getName() + " is spinning at speed " + speed);
        } else {
            System.out.println(getName() + " is OFF.");
        }
    }
}

class Heater extends Appliance {
    private int temperature;

    public Heater(String name, double powerUsage) {
        super(name, powerUsage);
        this.temperature = 20;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println(getName() + " temperature set to " + temperature + "°C");
    }

    @Override
    public void performFunction() {
        if (isOn()) {
            System.out.println(getName() + " is heating at " + temperature + "°C");
        } else {
            System.out.println(getName() + " is OFF.");
        }
    }
}

class TV extends Appliance {
    private int volume;
    private String channel;

    public TV(String name, double powerUsage) {
        super(name, powerUsage);
        this.volume = 20;
        this.channel = "News";
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println(getName() + " volume set to " + volume);
    }

    public void changeChannel(String channel) {
        this.channel = channel;
        System.out.println(getName() + " channel changed to " + channel);
    }

    @Override
    public void performFunction() {
        if (isOn()) {
            System.out.println(getName() + " is playing channel " + channel + " at volume " + volume);
        } else {
            System.out.println(getName() + " is OFF.");
        }
    }
}

class SmartHome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Light light = new Light("Living Room Light", 50);
        Fan fan = new Fan("Bedroom Fan", 75);
        Heater heater = new Heater("Bathroom Heater", 1500);
        TV tv = new TV("Family TV", 200);

        boolean running = true;

        while (running) {
            System.out.println("\n===== SMART HOME MENU =====");
            System.out.println("1. Turn ON Light");
            System.out.println("2. Turn OFF Light");
            System.out.println("3. Set Light Brightness");
            System.out.println("4. Turn ON Fan");
            System.out.println("5. Turn OFF Fan");
            System.out.println("6. Set Fan Speed");
            System.out.println("7. Turn ON Heater");
            System.out.println("8. Turn OFF Heater");
            System.out.println("9. Set Heater Temperature");
            System.out.println("10. Turn ON TV");
            System.out.println("11. Turn OFF TV");
            System.out.println("12. Change TV Channel");
            System.out.println("13. Set TV Volume");
            System.out.println("14. Show Appliance Status");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: light.turnOn(); break;
                case 2: light.turnOff(); break;
                case 3:
                    System.out.print("Enter brightness (0-100): ");
                    light.setBrightness(sc.nextInt()); break;
                case 4: fan.turnOn(); break;
                case 5: fan.turnOff(); break;
                case 6:
                    System.out.print("Enter speed (1-5): ");
                    fan.setSpeed(sc.nextInt()); break;
                case 7: heater.turnOn(); break;
                case 8: heater.turnOff(); break;
                case 9:
                    System.out.print("Enter temperature: ");
                    heater.setTemperature(sc.nextInt()); break;
                case 10: tv.turnOn(); break;
                case 11: tv.turnOff(); break;
                case 12:
                    System.out.print("Enter channel: ");
                    tv.changeChannel(sc.nextLine()); break;
                case 13:
                    System.out.print("Enter volume: ");
                    tv.setVolume(sc.nextInt()); break;
                case 14:
                    light.performFunction();
                    fan.performFunction();
                    heater.performFunction();
                    tv.performFunction();
                    break;
                case 0:
                    running = false;
                    System.out.println("Exiting Smart Home...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
