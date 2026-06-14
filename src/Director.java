public class Director extends Person {
    public Director (String name, String surname, Gender gender, int height) {
        super(name, surname, gender, height);
    }

    @Override
    public String toString() {
        return "Director{" + "name = " + name + ", surname = " + surname + '}';
    }

    public void printDirector() {
        System.out.print(toString());
    }
}
