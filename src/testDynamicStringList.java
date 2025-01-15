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

    }
}
