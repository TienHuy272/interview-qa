package hnt.coding.interview.design.structure.facade;


public class Application {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = HomeTheaterFacade.getInstance();
        homeTheaterFacade.watchMovie("Infinity war");
        homeTheaterFacade.endMovie();

    }
}
