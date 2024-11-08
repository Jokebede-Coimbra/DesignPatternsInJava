package estrutural.bridge.transmissions;

import estrutural.bridge.platforms.IPlatform;

public class RecordedLive extends Live{

    public RecordedLive(IPlatform platform) {
        super.platform = platform;
    }

    public void record() {
        System.out.println("A Live está sendo gravada.. ");
    }
}
