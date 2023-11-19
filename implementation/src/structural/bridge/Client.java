package structural.bridge;

import structural.bridge.remotes.RadioRemote;
import structural.bridge.remotes.SuperRemote;
import structural.bridge.remotes.TVRemote;

public class Client {
    private TVRemote tvRemote;
    private RadioRemote radioRemote;
    private SuperRemote superRemote;

    public Client(TVRemote tvRemote, RadioRemote radioRemote, SuperRemote superRemote) {
        this.tvRemote = tvRemote;
        this.radioRemote = radioRemote;
        this.superRemote = superRemote;
    }

    public void run() {
        tvRemote.togglePower();
        tvRemote.printStatus();
        tvRemote.channelUp();
        tvRemote.printStatus();
        tvRemote.volumeUp();
        tvRemote.printStatus();
        tvRemote.volumeDown();
        tvRemote.printStatus();
        tvRemote.channelDown();
        tvRemote.printStatus();
        tvRemote.togglePower();
        tvRemote.printStatus();

        radioRemote.togglePower();
        radioRemote.printStatus();
        radioRemote.channelUp();
        radioRemote.printStatus();
        radioRemote.volumeUp();
        radioRemote.printStatus();
        radioRemote.volumeDown();
        radioRemote.printStatus();
        radioRemote.channelDown();
        radioRemote.printStatus();
        radioRemote.togglePower();
        radioRemote.printStatus();

        superRemote.tvTogglePower();
        superRemote.tvPrintStatus();
        superRemote.radioTogglePower();
        superRemote.radioPrintStatus();
        superRemote.tvChannelUp();
        superRemote.tvPrintStatus();
        superRemote.radioChannelUp();
        superRemote.radioPrintStatus();
        superRemote.tvVolumeUp();
        superRemote.tvPrintStatus();
        superRemote.radioVolumeUp();
        superRemote.radioPrintStatus();
        superRemote.tvVolumeDown();
        superRemote.tvPrintStatus();
        superRemote.radioVolumeDown();
        superRemote.radioPrintStatus();
        superRemote.tvChannelDown();
        superRemote.tvPrintStatus();
        superRemote.radioChannelDown();
        superRemote.radioPrintStatus();
        superRemote.tvTogglePower();
        superRemote.tvPrintStatus();
        superRemote.radioTogglePower();
        superRemote.radioPrintStatus();
    }
}
