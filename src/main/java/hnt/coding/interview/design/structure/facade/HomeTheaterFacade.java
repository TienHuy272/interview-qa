package hnt.coding.interview.design.structure.facade;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheaterFacade() {
        this.dvdPlayer = new DVDPlayer();
        this.projector = new Projector();
        this.soundSystem = new SoundSystem();
    }

    public static HomeTheaterFacade getInstance() {
        return new HomeTheaterFacade();
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");

        projector.on();
        projector.wideScreenMode();

        soundSystem.on();
        soundSystem.setVolume(5);

        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");

        dvdPlayer.stop();
        dvdPlayer.off();

        projector.off();
        soundSystem.off();
    }
}
