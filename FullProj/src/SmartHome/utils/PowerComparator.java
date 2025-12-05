package SmartHome.utils;

import SmartHome.appliances.Appliance;
import java.util.Comparator;

public class PowerComparator implements Comparator<Appliance> {
    @Override
    public int compare(Appliance a1, Appliance a2) {
        return Double.compare(a1.getPowerUsage(), a2.getPowerUsage());
    }
}
