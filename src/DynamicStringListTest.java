import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class DynamicStringListTest {
    @Test
    public void testGet() {
        DynamicStringList list = new DynamicStringList();
        list.add("a");
        list.add("b");
        list.add("c");

        assertEquals("b", list.get(1));
    }

    @Test
    public void testGetCharacters() {
        DynamicStringList list = new DynamicStringList();
        list.add("}");
        list.add("#");
        list.add("%");

        assertEquals("%", list.get(2));
    }

    @Test
    public void testGetInvalidIndex() {
        DynamicStringList list = new DynamicStringList();
        list.add("1");
        list.add("2");
        list.add("3");
        
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(3));
    }

    @Test
    public void testSet() {
        DynamicStringList list = new DynamicStringList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("f");

        list.set(3, "z");
        assertEquals("z", list.get(3));
    }

    @Test
    public void testSetInvalidIndex() {
        DynamicStringList list = new DynamicStringList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("f");

        assertThrows(IndexOutOfBoundsException.class, () -> list.set(6, "z"));
    }

    @Test
    public void testAdd() {
        DynamicStringList list = new DynamicStringList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        
        assertEquals(5, list.size());
    }

    @Test
    public void testRemove() {
        DynamicStringList list = new DynamicStringList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("f");

        assertEquals(5, list.size());
    }

    @Test
    public void testRemoveInvalidIndex() {
        DynamicStringList list = new DynamicStringList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("f");

        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(10));
    }

    @Test
    public void testSize() {
        DynamicStringList list = new DynamicStringList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        assertEquals(5, list.size());
    }

    @Test
    public void testInitialCapacity() {
        DynamicStringList list = new DynamicStringList();

        assertEquals(10, list.capacity());
    }

    @Test
    public void testCapacityAfterAddingElements() {
        DynamicStringList list = new DynamicStringList();
        for (int i = 0; i < 15; i++) {
            list.add("Element" + i);
        }

        assertEquals(15, list.capacity());
    }
}
