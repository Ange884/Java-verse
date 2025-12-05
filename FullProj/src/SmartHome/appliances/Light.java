package SmartHome.appliances;

import SmartHome.utils.ApplianceType;
import SmartHome.utils.InvalidOperationException;

import java.util.regex.*;

public class Light extends Appliance {

    private static final Pattern BRIGHTNESS_PATTERN = Pattern.compile("^(0|[1-9][0-9]?|100)$");
    private static final Pattern CMD_BRIGHTNESS = Pattern.compile("(?i)^brightness\\s*(\\d{1,3})$");

    private int brightness;

    public Light(String name, double powerUsage) {
        super(name, powerUsage, ApplianceType.LIGHT);
        this.brightness = 50;
    }

    public void setBrightness(int brightness) throws InvalidOperationException {
        if (!BRIGHTNESS_PATTERN.matcher(String.valueOf(brightness)).matches()) {
            throw new InvalidOperationException("Brightness must be between 0 and 100!");
        }
        this.brightness = brightness;
        System.out.println(getName() + " brightness set to " + brightness + "%");
    }

    @Override
    public void voiceCommand(String command) {
        super.voiceCommand(command);

        Matcher match = CMD_BRIGHTNESS.matcher(command);

        if (match.matches()) {
            try {
                int value = Integer.parseInt(match.group(1));
                setBrightness(value);
            } catch (InvalidOperationException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void performFunction() {
        if (isOn()) {
            System.out.println(getName() + " glowing at " + brightness + "% brightness.");
        } else {
            System.out.println(getName() + " is OFF.");
        }
    }
}
