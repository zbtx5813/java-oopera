public class Director extends Person {
    Director (String name, String surname, Gender gender, int height) {
        super(name, surname, gender, height);
    }

    @Override
    public String toString() {
        return "Director{" + "name = " + name + ", surname = " + surname + '}';
    }

    void printDirector() {
        System.out.print(toString());
    }
}
