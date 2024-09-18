package hnt.coding.interview.design.structure.adapter;

/**
 * Current player only play MP3
 */
public interface MediaPlayer {
    void play(String audioType, String fileName);
}
