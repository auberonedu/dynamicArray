import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class testDynamicStringList {
    
    
    // Test for Adding and Getting the elements
    @Test
    public void testAddAndGet(){
        DynamicStringList list = new DynamicStringList();
        list.add("Hello");
        list.add("World");
        assertEquals("Hello", list.get(0));
        assertEquals("World", list.get(1));
    }

    // Test for removing an element
    @Test
    public void testRemove() {
        DynamicStringList list = new DynamicStringList();
        list.add("Hello");
        list.add("World");
        list.add("Goodbye");

        

        assertEquals("Goodbye", list.remove(2));

    }


    @Test
    public void testSize(){
        DynamicStringList list = new DynamicStringList();
        list.add("Hello");
        list.add("World");
        list.add("Goodbye");

        assertEquals(3, list.size());

    }
    @Test
    public void testCapacity(){
        DynamicStringList list = new DynamicStringList();

        assertEquals(10, list.capacity());

    }

    // Test for resizing
    @Test
    public void testResize() {
        DynamicStringList list = new DynamicStringList();
        for (int i = 0; i < 10; i++) {
            list.add("Element " + i);
        }
        assertEquals(10, list.size());
        assertEquals("Element 0", list.get(0));
        assertEquals("Element 5", list.get(5));
        assertEquals("Element 9", list.get(9));
    }
}
