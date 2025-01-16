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
        DynamicStringList colors = new DynamicStringList(3);
        colors.add("green");
        colors.add("red");
        colors.add("black");
        String removed = colors.remove(1);
        assertEquals("red", removed);
        assertEquals("green", colors.get(0));
        assertEquals("black", colors.get(1));
    }

    @Test
    public void testCapacity() {
        DynamicStringList capacity = new DynamicStringList(2);
        capacity.add("kaalid");
        capacity.add("Alston");
        assertEquals(2, capacity.capacity());
    }

    @Test
    public void testIndexOutOfBounds() {
        DynamicStringList InitialCapacity = new DynamicStringList(1);
        InitialCapacity.add("apple");
        assertEquals("apple", InitialCapacity.get(0));
    }
    
}
