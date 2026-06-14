import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    void printActors() {
        System.out.println("Актёры спектакля:");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    void addActor(Actor actor) {
        for (Actor actor2 : listOfActors) {
            if (actor.equals(actor2)) {
                System.out.print("Такой актёр уже есть в спектакле: ");
                System.out.println(actor.toString());
                return;
            }
        }
        listOfActors.add(actor);
    }

    void replaceActor(Actor newActor, Actor oldActor) {
        for  (Actor actor : listOfActors) {
            if (oldActor.equals(actor)) {
                actor.setActor(newActor);
                return;
            }
        }
        System.out.print("Такого актёра нет в спектакле: ");
        System.out.println(oldActor.toString());
    }
}
