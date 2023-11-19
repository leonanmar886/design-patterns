package structural.bridge.devices;

public class RadioDevice implements IDevice{
    private int channel = 1;
    private int volume = 50;
    private boolean enabled = false;
    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        this.enabled = true;
        System.out.println("Radio is enabled");
    }

    @Override
    public void disable() {
        this.enabled = false;
        System.out.println("Radio is disabled");
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent > 100) {
            this.volume = 100;
        } else if (percent < 0) {
            this.volume = 0;
        } else {
            this.volume = percent;
        }
        System.out.println("Radio volume is set to " + this.volume);
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Radio channel is set to " + this.channel);
    }

    @Override
    public void printStatus() {
        System.out.println("Radio is " + (enabled ? "enabled" : "disabled"));
        System.out.println("Radio volume is " + volume);
        System.out.println("Radio channel is " + channel);
    }
}
