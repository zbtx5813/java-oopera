import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 177);
        Actor actor2 = new Actor("Пётр", "Петров", Gender.MALE, 182);
        Actor actor3 = new Actor("Елена", "Смирнова", Gender.FEMALE, 168);

        Director director1 = new Director("Роман", "Романов", Gender.MALE, 190);
        Director director2 = new Director("Ксения", "Попова", Gender.FEMALE, 173);

        MusicAuthor musicAuthor = new MusicAuthor("Павел", "Павлов", Gender.MALE, 170);
        Choreographer choreographer = new Choreographer("Мария", "Носова", Gender.FEMALE, 164);

        Show show = new Show("Спектакль", 90, director1, new ArrayList<>());
        Opera opera = new Opera("Опера", 120, director2, new ArrayList<>(), musicAuthor,
                "Либретто к опере", 30);
        Ballet ballet = new Ballet("Балет", 60, director2, new ArrayList<>(), musicAuthor,
                "Либретто к балету", choreographer);

        show.addActor(actor1);
        show.addActor(actor2);
        opera.addActor(actor3);
        ballet.addActor(actor1);
        ballet.addActor(actor2);

        show.printActors();
        opera.printActors();
        ballet.printActors();

        show.replaceActor(actor3, actor2);
        show.printActors();

        opera.replaceActor(actor3, actor1);

        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}
