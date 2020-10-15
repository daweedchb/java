import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BallTest {

    private Ball ball;

    @Before
    public void setUp()  {
        ball = new Ball(40, 30);
    }

    @Test
    public void moveMethodTest() {
        Ball testBall = new Ball(120, 40);
        ball.move(80, 10);
        assertEquals(testBall.getX(), ball.getX(), 0.0001);
        assertEquals(testBall.getY(), ball.getY(), 0.0001);
    }

    @Test
    public void toStringMethodTest() {
        String expectedResult = "Ball @ (40.0, 30.0)";
        assertEquals(ball.toString(), expectedResult);
    }
}