import java.util.Objects;

public class Actor extends Person {
    public Actor (String name, String surname, Gender gender, int height) {
        super(name, surname, gender, height);
    }

    @Override
    public String toString() {
        return name + " " + surname + ", рост " +
                height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(name, actor.name) && Objects.equals(surname, actor.surname) &&
                Objects.equals(height, actor.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }

    public void setActor(Actor newActor) {
        this.name = newActor.name;
        this.surname = newActor.surname;
        this.height = newActor.height;
    }
}