import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DynamicStringListTest {
    private DynamicStringList list;

    @BeforeEach
    void setUp() {
        list = new DynamicStringList();
    }

    @Test
    void testAddAndGet() {
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        assertEquals("Apple", list.get(0));
        assertEquals("Banana", list.get(1));
        assertEquals("Cherry", list.get(2));
    }

    @Test
    void testSet() {
        list.add("Apple");
        list.set(0, "Apricot");

        assertEquals("Apricot", list.get(0));
    }

    @Test
    void testRemove() {
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        String removed = list.remove(1);
        assertEquals("Banana", removed);
        assertNull(list.get(1)); // Ensure the element is null after removal
    }

    @Test
    void testSize() {
        assertEquals(0, list.size());
        list.add("Apple");
        assertEquals(1, list.size());
        list.add("Banana");
        assertEquals(2, list.size());
        list.remove(1);
        assertEquals(1, list.size());
    }

    @Test
    void testCapacity() {
        assertEquals(10, list.capacity());

        // Add enough elements to trigger resizing
        for (int i = 0; i < 11; i++) {
            list.add("Element " + i);
        }
        assertEquals(20, list.capacity()); // Capacity should double
    }
}
