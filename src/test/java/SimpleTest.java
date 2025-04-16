import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleTest{

    @Test
    public void testEqualValues() {
        int expected = 2;
        int actual = 2;
        assertEquals(expected, actual, "egua");
    }
}
