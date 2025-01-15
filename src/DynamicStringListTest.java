import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicStringListTest {

    @Test
    public void stringListGetTest() {
        DynamicStringList list = new DynamicStringList();

        String[] myArr = { "Red", "Green", "Blue", "Orange" };

        for (String colors : myArr) {
            list.add(colors);
        }

        assertEquals("Red", list.get(0));
    }

    @Test
    public void stringListSetTest() {
        DynamicStringList list = new DynamicStringList();

        String[] myArr = { "Red", "Green", "Blue", "Orange" };

        for (String colors : myArr) {
            list.add(colors);
        }

        list.set(0, "Yellow");

        // Passes using .equals and ==
        assertTrue(list.get(0) == "Yellow");
        assertTrue(list.get(0).equals("Yellow"));

    }

    @Test
    public void stringListRemoveTest() {
        DynamicStringList list = new DynamicStringList();

        String[] myArr = { "Red", "Green", "Blue", "Orange" };

        for (String colors : myArr) {
            list.add(colors);
        }

        assertEquals("Red", list.remove(0));
    }

    @Test
    public void stringListAddTest() {
        DynamicStringList list = new DynamicStringList();
        String[] myArr = { "Red", "Green", "Blue", "Orange" };

        for (String colors : myArr) {
            list.add(colors);
        }

        list.add("Purple");

        assertTrue(list.get(4) == "Purple");
    }

    @Test
    public void stringListSizeTest() {
        DynamicStringList list = new DynamicStringList();
        String[] myArr = { "Red", "Green", "Blue", "Orange", "", "" };

        for (String colors : myArr) {
            list.add(colors);
        }
        assertEquals(6, list.size());
        assertNotEquals(9, list.size());
    }

    @Test
    public void stringListCapacityTest() {
        DynamicStringList list = new DynamicStringList();
        String[] myArr = { "Red", "Green", "Blue", "Orange", "Yellow", "Purple", "Brown", "Black", "White", "Gray" };

        for (String colors : myArr) {
            list.add(colors);
        }

        assertEquals(10, list.size());
        // check that the array has resized correctly
        assertTrue(list.capacity() >= 10);
    }

}