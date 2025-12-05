package SmartHome.appliances;

import SmartHome.utils.ApplianceType;
import SmartHome.utils.InvalidOperationException;

import java.util.regex.*;

public class TV extends Appliance {

    private static final Pattern CHANNEL_PATTERN = Pattern.compile("^[A-Za-z0-9 ]+$");
    private static final Pattern VOLUME_PATTERN = Pattern.compile("^([0-9]|[1-9][0-9])$");

    private static final Pattern CMD_CHANNEL = Pattern.compile("(?i)^channel\\s+([A-Za-z0-9 ]+)$");
    private static final Pattern CMD_VOLUME = Pattern.compile("(?i)^volume\\s*(\\d{1,2})$");

    private int volume;
    private String channel;

    public TV(String name, double powerUsage) {
        super(name, powerUsage, ApplianceType.TV);
        this.volume = 20;
        this.channel = "News";
    }

    public void setVolume(int volume) throws InvalidOperationException {
        if (!VOLUME_PATTERN.matcher(String.valueOf(volume)).matches()) {
            throw new InvalidOperationException("Volume must be between 0–99!");
        }
        this.volume = volume;
        System.out.println(getName() + " volume set to " + volume);
    }

    public void changeChannel(String channel) throws InvalidOperationException {
        if (!CHANNEL_PATTERN.matcher(channel).matches()) {
            throw new InvalidOperationException("Channel name must contain letters and numbers only!");
        }
        this.channel = channel;
        System.out.println(getName() + " channel changed to " + channel);
    }

    @Override
    public void voiceCommand(String command) {
        super.voiceCommand(command);

        Matcher m1 = CMD_CHANNEL.matcher(command);
        Matcher m2 = CMD_VOLUME.matcher(command);

        if (m1.matches()) {
            try {
                changeChannel(m1.group(1));
            } catch (InvalidOperationException e) {
                System.out.println(e.getMessage());
            }
        }
        else if (m2.matches()) {
            try {
                setVolume(Integer.parseInt(m2.group(1)));
            } catch (InvalidOperationException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void performFunction() {
        if (isOn()) {
            System.out.println(getName() + " playing " + channel + " at volume " + volume);
        } else {
            System.out.println(getName() + " is OFF.");
        }
    }
}
