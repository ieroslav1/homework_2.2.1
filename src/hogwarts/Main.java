package hogwarts;

import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Gryffindor potter = generateGryffindorStudent("Гарри Поттер");
        Gryffindor grainger = generateGryffindorStudent("Гермиона Грейнджер");
        Hufflepuff smith = generateHufflepuffStudent("Захария Смит");
        Hufflepuff finchfletchley = generateHufflepuffStudent("Джастин Финч-Флетчли");
        Ravenclaw chang = generateRavenclawStudent("Чжоу Чанг");
        Ravenclaw belby = generateRavenclawStudent("Маркус Белби");
        Slytherin malfoy = generateSlytherinStudent("Драко Малфой");
        Slytherin montague = generateSlytherinStudent("Грэхэм Монтегю");

        potter.print();
        grainger.print();
        smith.print();
        finchfletchley.print();
        chang.print();
        belby.print();
        malfoy.print();
        montague.print();

        potter.compareHogwarts(malfoy);
        smith.compareHogwarts(montague);
        potter.compareGriffindor(grainger);
        chang.compareRavenclaw(belby);
    }

    private static Gryffindor generateGryffindorStudent(String name) {
        return new Gryffindor(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Hufflepuff generateHufflepuffStudent(String name) {
        return new Hufflepuff(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Ravenclaw generateRavenclawStudent(String name) {
        return new Ravenclaw(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static Slytherin generateSlytherinStudent(String name) {
        return new Slytherin(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

}