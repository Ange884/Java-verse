package SmartHome.Threads;
import SmartHome.appliances.Appliance;

public class ApplianceThread extends Thread {
    private Appliance appliance;

    public ApplianceThread(Appliance appliance) {
        this.appliance = appliance;
    }

    @Override
    public void run() {
        try {
            appliance.turnOn();
            appliance.useFor(2);
            appliance.performFunction();
            appliance.turnOff();
        } catch (Exception e) {
            System.out.println("Thread error: " + e.getMessage());
        }
    }
}


