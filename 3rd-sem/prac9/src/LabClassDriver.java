import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import static java.lang.System.err;
import static java.lang.System.out;

public class LabClassDriver {

    LabClass labClass;
    String FILE = "prac9/src/list.txt";

    LabClassDriver(LabClass labClass) {
        this.labClass = labClass;
    }

    public void createLabClass() {
        out.print("Введите имя и оценку студента, чтобы добавить его ('exit' - выйти из цикла): ");
        String name;
        int grade;
        Scanner in = new Scanner(System.in);
        do {
            name = (in.next()).toLowerCase();
            if (!name.equals("exit")) {
                grade = in.nextInt();
                labClass.add(new Student(name, grade));
            }
        } while (!name.equals("exit"));
    }

    public void saveLabCLass() {

        try {
            FileWriter writer = new FileWriter(FILE);

            while (!labClass.isEmpty()) {
                writer.write(labClass.remove().toString() + "\n");
            }
            writer.flush();
        } catch (Exception e) {
            err.println("Такого файла нет!");
        }

    }

    public void fillLabClass() {
        try {
            FileReader reader = new FileReader(FILE);
            Scanner in = new Scanner(reader);
            while (in.hasNextLine()) {
                String string = in.nextLine();
                int firstIndex = string.indexOf("name='") + 6;
                int lastIndex = string.lastIndexOf('\'');
                String name = string.substring(firstIndex, lastIndex);

                firstIndex = string.indexOf("grade=") + 6;
                lastIndex = string.lastIndexOf('}');
                int grade = Integer.parseInt(string.substring(firstIndex, lastIndex));

                labClass.add(new Student(name, grade));
            }
        } catch (FileNotFoundException e) {
            err.println("Такого файла нет!");
        }

    }
}