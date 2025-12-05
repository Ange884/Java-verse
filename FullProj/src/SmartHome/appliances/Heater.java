package SmartHome.appliances;

import SmartHome.utils.ApplianceType;
import SmartHome.utils.InvalidOperationException;

import java.util.regex.*;

public class Heater extends Appliance {

    private static final Pattern TEMP_PATTERN = Pattern.compile("^(1[0-9]|2[0-9]|3[0-9]|4[0-5])$");
    private static final Pattern CMD_TEMP = Pattern.compile("(?i)^temperature\\s*(\\d{2})$");

    private int temperature;

    public Heater(String name, double powerUsage) {
        super(name, powerUsage, ApplianceType.HEATER);
        this.temperature = 20;
    }

    public void setTemperature(int temperature) throws InvalidOperationException {
        if (!TEMP_PATTERN.matcher(String.valueOf(temperature)).matches()) {
            throw new InvalidOperationException("Temperature must be between 10°C and 45°C!");
        }
        this.temperature = temperature;
        System.out.println(getName() + " temperature set to " + temperature + "°C");
    }

    @Override
    public void voiceCommand(String command) {
        super.voiceCommand(command);

        Matcher m = CMD_TEMP.matcher(command);

        if (m.matches()) {
            try {
                int value = Integer.parseInt(m.group(1));
                setTemperature(value);
            } catch (InvalidOperationException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void performFunction() {
        if (isOn()) {
            System.out.println(getName() + " heating at " + temperature + "°C");
        } else {
            System.out.println(getName() + " is OFF.");
        }
    }
}
