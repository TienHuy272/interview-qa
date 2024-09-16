package hnt.coding.interview.design.creation.prototype;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> releaseVersion = Arrays.asList(1,2,3);
        Computer computer1 = new Computer("Window 10",
                "Word 2013", "BKAV", "Chrome v69",
                "Skype", 11, releaseVersion);

        List<Integer> releaseVersionC2 = Arrays.asList(4,5,6);

        Computer computer2 = computer1.clone();
        computer2.setOs("MACOS");
        computer2.setOffice("Office 365");
        computer2.setVersion(22);
        computer2.setReleaseVersions(releaseVersionC2);
        computer2.setOthers("Skype, Teamviewer, FileZilla Client");

        System.out.println(computer1);
        System.out.println(computer2);
    }
}
