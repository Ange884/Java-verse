package SmartHome.appliances;

import SmartHome.utils.ApplianceType;
import SmartHome.utils.InvalidOperationException;

import java.util.regex.*;

public class Fan extends Appliance {

    private static final Pattern SPEED_PATTERN = Pattern.compile("^[1-5]$");
    private static final Pattern CMD_SPEED = Pattern.compile("(?i)^speed\\s*([1-5])$");

    private int speed;

    public Fan(String name, double powerUsage) {
        super(name, powerUsage, ApplianceType.FAN);
        this.speed = 1;
    }

    public void setSpeed(int speed) throws InvalidOperationException {
        if (!SPEED_PATTERN.matcher(String.valueOf(speed)).matches()) {
            throw new InvalidOperationException("Speed must be between 1 and 5!");
        }
        this.speed = speed;
        System.out.println(getName() + " speed set to " + speed);
    }

    @Override
    public void voiceCommand(String command) {
        super.voiceCommand(command);

        Matcher m = CMD_SPEED.matcher(command);

        if (m.matches()) {
            try {
                int value = Integer.parseInt(m.group(1));
                setSpeed(value);
            } catch (InvalidOperationException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void performFunction() {
        if (isOn()) {
            System.out.println(getName() + " spinning at speed " + speed);
        } else {
            System.out.println(getName() + " is OFF.");
        }
    }
}


