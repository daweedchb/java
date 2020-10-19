import java.util.Scanner;

import static java.lang.System.*;

public class LabClassUI {
    LabClass labClass;


    public LabClassUI() {
        labClass = new LabClass();
        LabClassDriver driver = new LabClassDriver(labClass);
        Scanner in = new Scanner(System.in);
        boolean created = false;
        out.print("Хотите ли вы создать новый список? (да или нет; если нет, он загрузит старый): ");

        String input = (in.nextLine()).toLowerCase();
        if (input.equals("да")) {
            driver.createLabClass();
            created = true;
        } else if (input.equals("нет")) {
            driver.fillLabClass();
        } else {
            err.print("Неправильный ввод!!! Запись недоступна, список заполняется из памяти!");
            out.println('\n');
            driver.fillLabClass();
        }

        if (created) {
            out.println("Хотите ли вы сохранить список? (да или нет): ");
            input = (in.next()).toLowerCase();
            if (input.equals("да")) {
                driver.saveLabCLass();
            }
            driver.fillLabClass();
        }
    }

    public void findStudent() {
        Scanner in = new Scanner(System.in);
        out.print("Введите имя студента: ");
        String name;

        try {
            name = (in.nextLine()).toLowerCase();
            if (name.isEmpty()) {

                throw new EmptyStringException("Вы ввели пустую строку!");
            }
        } catch (EmptyStringException e) {
            err.println(e.getMessage());
            out.println();
            findStudent();
            return;
        }

        try {
            out.println(labClass.find(name).toString());
        } catch (StudentNotFoundException e) {
            err.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        LabClassUI app = new LabClassUI();
        app.findStudent();
    }
}