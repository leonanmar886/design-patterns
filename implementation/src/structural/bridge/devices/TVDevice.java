package structural.bridge.devices;

public class TVDevice implements IDevice{
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
        System.out.println("TV is enabled");
    }

    @Override
    public void disable() {
        this.enabled = false;
        System.out.println("TV is disabled");
    }

    @Override
    public int getVolume() {
        return volume;
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
        System.out.println("TV volume is set to " + this.volume);
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("TV channel is set to " + this.channel);
    }

    @Override
    public void printStatus() {
        System.out.println("TV is " + (enabled ? "enabled" : "disabled"));
        System.out.println("TV volume is " + volume);
        System.out.println("TV channel is " + channel);
    }
}
