package SmartHome.appliances;

import SmartHome.utils.ApplianceType;
import SmartHome.utils.InvalidOperationException;

import java.util.regex.*;

public abstract class Appliance implements Comparable<Appliance> {

    private static final Pattern NAME_PATTERN = Pattern.compile("^[A-Za-z ]{3,}$");
    private static final Pattern HOURS_PATTERN = Pattern.compile("^[0-9]*\\.?[0-9]+$");
    private static final Pattern CMD_ON = Pattern.compile("(?i)^(turn\\s*on|on)$");
    private static final Pattern CMD_OFF = Pattern.compile("(?i)^(turn\\s*off|off)$");

    private String name;
    private boolean isOn;
    private double powerUsage;
    private double hoursUsed;
    private ApplianceType type;

    // ---------------- CONSTRUCTOR ----------------
    public Appliance(String name, double powerUsage, ApplianceType type) {

        if (!NAME_PATTERN.matcher(name).matches()) {
            throw new IllegalArgumentException("Invalid appliance name! Must contain only letters & spaces, min 3 chars.");
        }

        this.name = name;
        this.powerUsage = powerUsage;
        this.type = type;
        this.isOn = false;
        this.hoursUsed = 0;
    }

    // ---------------- GETTERS ----------------
    public String getName() { return name; }
    public boolean isOn() { return isOn; }
    public double getPowerUsage() { return powerUsage; }
    public ApplianceType getType() { return type; }

    // ---------------- ON/OFF ----------------
    public void turnOn() {
        isOn = true;
        System.out.println(name + " turned ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " turned OFF");
    }

    // ---------------- USAGE WITH REGEX VALIDATION ----------------
    public void useFor(double hours) throws InvalidOperationException {

        String hoursText = String.valueOf(hours);

        if (!HOURS_PATTERN.matcher(hoursText).matches()) {
            throw new InvalidOperationException("Invalid hours format! Must be a number.");
        }

        if (!isOn) {
            throw new InvalidOperationException(name + " is OFF!");
        }

        hoursUsed += hours;
        System.out.println(name + " used for " + hours + " hours");
    }

    public double getTotalConsumption() {
        return hoursUsed * powerUsage;
    }

    // ---------------- COMPARABLE ----------------
    @Override
    public int compareTo(Appliance other) {
        return this.getName().compareTo(other.getName());
    }

    // ---------------- NEW: VOICE COMMAND USING REGEX ----------------
    public void voiceCommand(String command) {

        command = command.trim().toLowerCase();

        if (CMD_ON.matcher(command).matches()) {
            turnOn();
        }
        else if (CMD_OFF.matcher(command).matches()) {
            turnOff();
        }
        else {
            System.out.println("Unknown command for " + name + ": " + command);
        }
    }

    // ---------------- ABSTRACT FUNCTION ----------------
    public abstract void performFunction();
}
