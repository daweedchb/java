package shape;

public class Circle extends Shape {

    protected double radius;

    public Circle() {
        this.radius = 1;
        this.color = "red";
        this.filled = false;
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
        this.filled = false;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "shape.Shape: circle, radius: " + this.radius + ", color: " + this.color + ", is filled: " + this.filled;
    }
}