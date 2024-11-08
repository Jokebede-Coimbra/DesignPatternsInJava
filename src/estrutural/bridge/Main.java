package estrutural.bridge;

import estrutural.bridge.platforms.*;
import estrutural.bridge.transmissions.AdvancedLive;
import estrutural.bridge.transmissions.Live;
import estrutural.bridge.transmissions.RecordedLive;

public class Main {
    public static void main(String[] args) {

        startLive(new YouTube());
        startLive(new TwitchTV());
        startLive(new Facebook());
        startLive(new DisneyPlus());
    }

    public static void startLive(IPlatform platform) {
//        System.out.println("..Aguarde!");
//        Live live = new Live(platform);
//        live.broadcasting();
//        live.result();

//        System.out.println("Transmissão avançada..aguarde");
//        AdvancedLive advancedLive = new AdvancedLive(platform);
//        advancedLive.broadcasting();
//        advancedLive.comments();
//        advancedLive.subtitles();
//        advancedLive.result();

        System.out.println("Gravação iniciada..");
        RecordedLive recordedLive = new RecordedLive(platform);
        recordedLive.broadcasting();
        recordedLive.record();
        recordedLive.result();



    }
}
