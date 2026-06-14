public class Person {
    protected String name, surname;
    protected Gender gender;
    protected int height;

    public Person (String name, String surname, Gender gender, int height) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.height = height;
    }
}

enum Gender {
    MALE,FEMALE
}
