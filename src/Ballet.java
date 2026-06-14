import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private Choreographer choreographer;

    public Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActors, MusicAuthor musicAuthor,
           String librettoText, Choreographer choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    @Override
    public void printActors() {
        System.out.println("Актёры балета:");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    @Override
    public void printLibrettoText() {
        System.out.println("Текст либретто к балету:");
        System.out.println(librettoText);
    }

    @Override
    public void addActor(Actor actor) {
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
    public void replaceActor(Actor newActor, Actor oldActor) {
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