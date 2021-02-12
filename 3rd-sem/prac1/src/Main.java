public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Барон", "Чёрный", 6);
        Book book = new Book("Война и мир", 600);
        Ball ball = new Ball("Волейбол", "Средний");

        dog.getInfo();
        System.out.println("\n");
        book.getInfo();
        System.out.println("\n");
        ball.getInfo();
    }
}