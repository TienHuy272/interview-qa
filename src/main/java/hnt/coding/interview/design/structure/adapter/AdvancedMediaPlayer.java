package hnt.coding.interview.design.structure.adapter;


/**
 * Advanced player can play vlc, mp4
 */
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}
