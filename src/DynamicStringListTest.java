import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicStringListTest {
    @Test
    public void testGet() {
        DynamicStringList word = new DynamicStringList();
        
        assertEquals(0, word.size()); //Size starts off at 0
            word.add("carrot");
            word.add("orange");
        
        assertEquals("carrot", word.get(3));
        assertEquals("orange", word.get(1));
    }
}
