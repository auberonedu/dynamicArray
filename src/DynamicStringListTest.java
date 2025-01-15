import org.junit.Test;
import static org.junit.Assert.*;

public class DynamicStringListTest {

    @Test
    public void testAddAndListSize() {
        DynamicStringList dynamicList = new DynamicStringList(3);
        dynamicList.add("Apple");
        dynamicList.add("Banana");
        assertEquals(2, dynamicList.size());
        assertEquals("Apple", dynamicList.get(0));
        assertEquals("Banana", dynamicList.get(1));
    }

    @Test
    public void testUpdateElement() {
        DynamicStringList namesList = new DynamicStringList(2);
        namesList.add("Alston");
        namesList.add("Sam");
        namesList.set(1, "Doe");
        assertEquals("Doe", namesList.get(1));
        assertEquals("Alston", namesList.get(0));
    }

    @Test
    public void testRemove() {

    }

    @Test
    public void testCapacity() {

    }

    @Test
    public void testIndexOutOfBounds() {
         
    }
    
}
