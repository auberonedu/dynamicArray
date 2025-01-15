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

    }

    // Test for resizing
    @Test
    public void testResize() {

    }
}
