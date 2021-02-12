package movable;

public class MovableCircle implements Movable {

    private final MovablePoint center;
    private final int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }


    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "Now center is on x: " + center.x + ", y: " + center.y + ". Circle crosses oX axis in x = " +
                (center.x + this.radius) + ", " + (center.x - this.radius) + " and oY axis in y = " +
                +(center.y + this.radius) + ", " + (center.y - this.radius);
    }
}