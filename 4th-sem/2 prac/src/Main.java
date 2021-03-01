import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Human> list = new ArrayList<>();
        list.add(new Human(12, "abter", "Potter", LocalDate.of(2009, 1, 4), 50));
        list.add(new Human(18, "cdter", "Longer", LocalDate.of(2002, 6, 27), 69));
        list.add(new Human(30, "bcter", "Finger", LocalDate.of(1991, 2, 10), 72));
        list.add(new Human(51, "dater", "Иванов", LocalDate.of(1969, 9, 2), 59));

        System.out.println("1: сортировка по весу в обратном порядке");
        Stream<Human> stream = list.stream().sorted(Comparator.comparingInt(Human::getWeight).reversed());
        stream.forEach(e -> System.out.println(e.toString()));

        System.out.println("\n2: фильтрация по фамилии не Иванов");
        stream = list.stream().filter(c -> !c.getLastName().equals("Иванов"));
        stream.forEach(e -> System.out.println(e.toString()));

        System.out.println("\n3: сортировка по возрасту");
        stream = list.stream().sorted(Comparator.comparing(Human::getAge));
        stream.forEach(e -> System.out.println(e.toString()));

        System.out.println("\n4: произведение всех возрастов");
        System.out.println(list.stream().mapToInt(Human::getAge).reduce(1, Math::multiplyExact));
    }
}
