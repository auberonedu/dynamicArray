import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicStringListTest {

    // Tests the get method. Should return a string at the specified index.
    @Test
    void getTest() {
        DynamicStringList test = new DynamicStringList(3);
        test.add("hello");
        test.add("goodbye");
        test.add("This is a test");

        assertEquals("hello", test.get(0));
        assertEquals("goodbye", test.get(1));
        assertEquals("This is a test", test.get(2));
    }

    // Tests the set method. Should replace the string at a specified index.
    @Test
    void setTest() {
        DynamicStringList test = new DynamicStringList(5);
        test.add("First");
        test.add("Second");
        test.add("Third");
        test.add("Fourth");
        test.add("Fifth");

        test.set(2, "Seventh");
        assertEquals("Seventh", test.get(2));
    }

    /*
     * Tests the add method. Should tack a new string at the end of the list.
     * Creates a new list to account for size if capacity is reached, also
     * incremenets up by one.
     */
    @Test
    void addTest() {
        DynamicStringList test = new DynamicStringList(3);
        test.add("hello");
        test.add("goodbye");
        test.add("This is a test");
        test.add("Did it pass?");

        assertEquals("hello", test.get(0));
        assertEquals("goodbye", test.get(1));
        assertEquals("This is a test", test.get(2));
        assertEquals("Did it pass?", test.get(3));
    }

    // Tests the remove method. Removed a string at the specified index from the
    // list.
    @Test
    void removeTest() {
        DynamicStringList test = new DynamicStringList(4);
        test.add("Primus");
        test.add("Secundus");
        test.add("Tertius");
        test.add("Quartus");

        assertEquals("Tertius", test.remove(2));
        assertEquals("Primus", test.remove(0));

    }

    // Tests the size method. Returns the number of strings currently in the list.
    @Test
    void sizeTest() {
        DynamicStringList test = new DynamicStringList(3);
        test.add("Quintus");
        test.add("Sextus");
        test.add("Septimus");

        assertEquals(3, test.size());
    }

    /*
     * Tests the capactity method. Returns the number of string the list can hold
     * before needing to be resized.
     */
    @Test
    void capacityTest() {
        DynamicStringList test = new DynamicStringList(8);
        test.add("hello");
        test.add("goodbye");
        test.add("This is a test");
        test.add("Did it pass?");

        assertEquals(8, test.capacity());
    }
}
