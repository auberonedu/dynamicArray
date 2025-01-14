import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicListTest {
    @Test
    void testAdd() {
        DynamicStringList list = new DynamicStringList();
        list.add("First");
        list.add("Second");
        
        assertEquals(2, list.size());
        assertEquals("First", list.get(0));
        assertEquals("Second", list.get(1));
    }

}