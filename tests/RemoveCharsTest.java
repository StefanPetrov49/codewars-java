import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveCharsTest {

    @Test
    public void testRemoval() {
        assertEquals("loquen", RemoveChars.remove("eloquent"));
        assertEquals("ountr", RemoveChars.remove("country"));
        assertEquals("erso", RemoveChars.remove("person"));
        assertEquals("lac", RemoveChars.remove("place"));
    }
}
