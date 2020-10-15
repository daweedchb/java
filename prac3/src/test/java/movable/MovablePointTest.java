package movable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovablePointTest {

    MovablePoint movablePoint;

    @Before
    public void setUp() {
        movablePoint = new MovablePoint(0, 0, 3, 2);
    }

    @Test
    public void forMoveMethodsTest() {
        movablePoint.moveRight();
        assertEquals(3, movablePoint.x);
        movablePoint.moveLeft();
        assertEquals(0, movablePoint.x);
        movablePoint.moveUp();
        assertEquals(2, movablePoint.y);
        movablePoint.moveDown();
        assertEquals(0, movablePoint.y);
    }
}