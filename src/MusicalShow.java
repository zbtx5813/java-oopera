import java.util.ArrayList;

public class MusicalShow extends Show {
    MusicAuthor musicAuthor;
    String librettoText;

    MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors, MusicAuthor musicAuthor,
                String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    @Override
    void printActors() {
        System.out.println("Актёры музыкального спектакля:");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    void printLibrettoText() {
        System.out.println("Текст либретто:");
        System.out.println(librettoText);
    }

    @Override
    void addActor(Actor actor) {
        for (Actor actor2 : listOfActors) {
            if (actor.equals(actor2)) {
                System.out.print("Такой актёр уже есть в музыкальном спектакле: ");
                System.out.println(actor.toString());
                return;
            }
        }
        listOfActors.add(actor);
    }

    @Override
    void replaceActor(Actor newActor, Actor oldActor) {
        for  (Actor actor : listOfActors) {
            if (oldActor.equals(actor)) {
                actor.setActor(newActor);
                return;
            }
        }
        System.out.print("Такого актёра нет в музыкальном спектакле: ");
        System.out.println(oldActor.toString());
    }
}
