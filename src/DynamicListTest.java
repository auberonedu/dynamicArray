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

    @Test
    void testGet() {
        DynamicStringList list = new DynamicStringList();
        list.add("Hello");
        list.add("World");
        assertEquals("Hello", list.get(0));
        assertEquals("World", list.get(1));
    }

    @Test
    void testSet() {
        DynamicStringList list = new DynamicStringList();
        list.add("Hello");
        list.add("World");
        list.set(1, "Java");
        assertEquals("Java", list.get(1));
    }

    @Test
    void testRemove() {
        DynamicStringList list = new DynamicStringList();
        list.add("Hello");
        list.add("World");
        String removed = list.remove(0);
        assertEquals("Hello", removed);
        assertEquals(1, list.size());
        assertEquals("World", list.get(0));
    }
}