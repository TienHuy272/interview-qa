package hnt.coding.interview.design.structure.adapter;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("PLay VLC file: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
