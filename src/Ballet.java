import java.util.ArrayList;

public class Ballet extends MusicalShow {
    Choreographer choreographer;

    Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActors, MusicAuthor musicAuthor,
           String librettoText, Choreographer choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    @Override
    void printActors() {
        System.out.println("Актёры балета:");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    @Override
    void printLibrettoText() {
        System.out.println("Текст либретто к балету:");
        System.out.println(librettoText);
    }

    @Override
    void addActor(Actor actor) {
        for (Actor actor2 : listOfActors) {
            if (actor.equals(actor2)) {
                System.out.print("Такой актёр уже есть в балете: ");
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
        System.out.print("Такого актёра нет в балете: ");
        System.out.println(oldActor.toString());
    }
}