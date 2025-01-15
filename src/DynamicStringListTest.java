import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicStringListTest {
    @Test
    public void testGet() {
        DynamicStringList word = new DynamicStringList();

            word.add("avocado");
            word.add("orange");
        
        assertEquals("avocado", word.get(3));
        assertEquals("orange", word.get(1));
    }

    @Test
    public void testSet() {
      
    }

    @Test
    public void testAdd() {
        DynamicStringList word = new DynamicStringList();
        word.add("hello");
        word.add("world");

        assertEquals(0, word.size());
      
    }

    @Test
    public void testRemove() {
      
    }
}
