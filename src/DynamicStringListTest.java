import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicStringListTest {
    
    // Tests the get method. Should return a string at the specified index.
    @Test
    void getTest(){
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
    void setTest(){

    }

    /* Tests the add method. Should tack a new string at the end of the list.
    Creates a new list to account for size if capacity is reached, also
    incremenets up by one. */
    @Test
    void addTest(){
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

    // Tests the remove method. Removed a string at the specified index from the list.
    @Test
    void removeTest(){

    }

    // Tests the size method. Returns the number of strings currently in the list.
    @Test
    void sizeTest(){

    }

    /* Tests the capactity method. Returns the number of string the list can hold
    before needing to be resized. */
    @Test
    void capacityTest(){
        DynamicStringList test = new DynamicStringList(8);
        test.add("hello");
        test.add("goodbye");
        test.add("This is a test");
        test.add("Did it pass?");

        assertEquals(8, test.capacity());
    }
}
