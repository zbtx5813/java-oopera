import java.util.ArrayList;

public class Opera extends MusicalShow {
    int choirSize;

    Opera(String title, int duration, Director director, ArrayList<Actor> listOfActors, MusicAuthor musicAuthor,
           String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    void printActors() {
        System.out.println("Актёры оперы:");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    @Override
    void printLibrettoText() {
        System.out.println("Текст либретто к опере:");
        System.out.println(librettoText);
    }

    @Override
    void addActor(Actor actor) {
        for (Actor actor2 : listOfActors) {
            if (actor.equals(actor2)) {
                System.out.print("Такой актёр уже есть в опере: ");
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
        System.out.print("Такого актёра нет в опере: ");
        System.out.println(oldActor.toString());
    }
}