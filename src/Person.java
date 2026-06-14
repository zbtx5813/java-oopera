public class Person {
    String name, surname;
    Gender gender;
    int height;

    Person (String name, String surname, Gender gender, int height) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.height = height;
    }
}

enum Gender {
    MALE,FEMALE
}
