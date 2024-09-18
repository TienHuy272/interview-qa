package hnt.coding.interview.design.structure.facade;

public class SoundSystem {
    public void on() {
        System.out.println("Sound System is ON");
    }

    public void off() {
        System.out.println("Sound System is OFF");
    }

    public void setVolume(int level) {
        System.out.println("Sound System volume set to " + level);
    }
}
