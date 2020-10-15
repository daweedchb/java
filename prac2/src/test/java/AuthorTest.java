import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AuthorTest {

    private Author author;

    @Before
    public void setUp() {
        author = new Author("John Smith", "johnSmith@gmail.com", 'M');
    }

    @Test
    public void toStringMethodTest() {
        String expectedResult = "John Smith (M) at johnSmith@gmail.com";
        assertEquals(expectedResult, author.toString());
    }
}