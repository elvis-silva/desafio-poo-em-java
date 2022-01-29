import com.elvissilva.desafio.poo.Bootcamp;
import com.elvissilva.desafio.poo.Course;
import com.elvissilva.desafio.poo.Dev;
import com.elvissilva.desafio.poo.Mentorship;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Course course1 = new Course();
        course1.setTitle("Java");
        course1.setDescription("Learn Java");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("Python");
        course2.setDescription("Learn Python");
        course2.setWorkload(10);

        Mentorship mentorship = new Mentorship();
        mentorship.setTitle("Java Mentorship");
        mentorship.setDescription("Learn more Java");
        mentorship.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Learn Java Now");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentorship);

        Dev dev = new Dev();
        dev.setName("Elvis");
        dev.bootcampInscribe(bootcamp);
        System.out.println("Elvis current content: " + dev.getCurrentContents());
        dev.progress();
        dev.progress();
        System.out.println("-");
        System.out.println("Elvis current content: " + dev.getCurrentContents());
        System.out.println("Elvis current content: " + dev.getConcludedContents());
        System.out.println("XP: " + dev.calculateTotalXP());

        System.out.println("-------");

        Dev dev2 = new Dev();
        dev2.setName("Jessica");
        dev2.bootcampInscribe(bootcamp);
        System.out.println("Jessica current content: " + dev2.getCurrentContents());
        dev2.progress();
        dev2.progress();
        dev2.progress();
        System.out.println("-");
        System.out.println("Jessica current content: " + dev2.getCurrentContents());
        System.out.println("Jessica current content: " + dev2.getConcludedContents());
        System.out.println("XP: " + dev2.calculateTotalXP());
    }
}
