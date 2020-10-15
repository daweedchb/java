package shape;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    private Circle circle;

    @Before
    public void setUp() {
        circle = new Circle();
    }

    @Test
    public void getAreaMethodTest() {
        double expectedResult = 1 * Math.PI;
        assertEquals(expectedResult, circle.getArea(), 0.0000001);
    }

    @Test
    public void getPerimeterMethodTest() {
        double expectedResult = 2 * Math.PI * 1;
        assertEquals(expectedResult, circle.getPerimeter(), 0.0000001);
    }

    @Test(expected = ClassCastException.class) //Downcast/upcast test
    public void classCastExceptionTest() {
        Shape shape = (Shape) circle;
        Rectangle rectangle = (Rectangle) shape;
    }
}