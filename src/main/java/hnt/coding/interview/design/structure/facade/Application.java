package hnt.coding.interview.design.structure.facade;


public class Application {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdPlayer, projector, soundSystem);
        homeTheaterFacade.watchMovie("Infinity war");
        homeTheaterFacade.endMovie();

    }
}
