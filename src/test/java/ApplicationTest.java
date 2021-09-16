import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    void calcDistance1() {
        Application app = new Application();

        double expected = Math.sqrt(2);
        double actual = app.calcDistance(1, 1, 2, 2);

        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void calcDistance2() {
        Application app = new Application();

        double expected = 2;
        double actual = app.calcDistance(0, 0, 0, 2);

        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void testMakeGreeting() {
        String expected = "Hello, World!";
        String actual = Application.makeGreeting();

        // do not use ==
        // myString.equals(makeGreeting());

        assertEquals(expected, actual);
    }
}