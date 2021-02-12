public class Ball {

    private final String assignment;
    private final String size;

    public Ball(String assignment, String size) {
        this.assignment = assignment;
        this.size = size;
    }

    void getInfo() {
        System.out.println("Мяч для игры в " + assignment + "\nРазмер: " + size);
    }
}