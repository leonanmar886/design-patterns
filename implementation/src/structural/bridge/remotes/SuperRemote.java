package structural.bridge.remotes;

import structural.bridge.devices.IDevice;

public class SuperRemote {
    private IDevice radioDevice;
    private IDevice tvDevice;

    public SuperRemote(IDevice radioDevice, IDevice tvDevice) {
        this.radioDevice = radioDevice;
        this.tvDevice = tvDevice;
    }

    public void tvTogglePower() {
        if (tvDevice.isEnabled()) {
            tvDevice.disable();
        } else {
            tvDevice.enable();
        }
    }

    public void radioTogglePower() {
        if (radioDevice.isEnabled()) {
            radioDevice.disable();
        } else {
            radioDevice.enable();
        }
    }

    public void tvVolumeDown() {
        tvDevice.setVolume(tvDevice.getVolume() - 1);
    }

    public void radioVolumeDown() {
        radioDevice.setVolume(radioDevice.getVolume() - 1);
    }

    public void tvVolumeUp() {
        tvDevice.setVolume(tvDevice.getVolume() + 1);
    }

    public void radioVolumeUp() {
        radioDevice.setVolume(radioDevice.getVolume() + 1);
    }

    public void tvChannelDown() {
        tvDevice.setChannel(tvDevice.getChannel() - 1);
    }

    public void radioChannelDown() {
        radioDevice.setChannel(radioDevice.getChannel() - 1);
    }

    public void tvChannelUp() {
        tvDevice.setChannel(tvDevice.getChannel() + 1);
    }

    public void radioChannelUp() {
        radioDevice.setChannel(radioDevice.getChannel() + 1);
    }

    public void tvPrintStatus() {
        tvDevice.printStatus();
    }

    public void radioPrintStatus() {
        radioDevice.printStatus();
    }
}
