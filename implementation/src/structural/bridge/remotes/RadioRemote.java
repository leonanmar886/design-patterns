package structural.bridge.remotes;

import structural.bridge.devices.IDevice;

public class RadioRemote {
    private IDevice device;

    public RadioRemote(IDevice device) {
        this.device = device;
    }

    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeDown() {
        device.setVolume(device.getVolume() - 1);
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 1);
    }

    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }

    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }

    public void printStatus() {
        device.printStatus();
    }
}
