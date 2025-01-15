import static org.junit.Assert.*;
import org.junit.Test;

public class DynamicStringListTest {

    @Test
    public void getValidIndex() {
        DynamicStringList list = new DynamicStringList();

        list.add("Hi");
        list.add("Bye");
        list.add("Ham");

        assertEquals("Ham", list.get(2));

    }

    @Test
    public void getInvalidIndex() {
        DynamicStringList list = new DynamicStringList();

        list.add("Hi");
        list.add("Bye");
        list.add("Ham");

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-2));
    }

    @Test
    public void getInvalidIndexBiggerThanSize() {
        DynamicStringList list = new DynamicStringList();

        list.add("Hi");
        list.add("Bye");
        list.add("Ham");

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(4));
    }

    @Test
    public void setIndex() {
        DynamicStringList list = new DynamicStringList();

        list.add("Hi");
        list.add("Bye");
        list.add("Ham");

        list.set(1, "bacon");

        assertEquals("bacon", list.get(1));
    }

    @Test
    public void setInvalidIndex() {
        DynamicStringList list = new DynamicStringList();

        list.add("Hi");
        list.add("Bye");
        list.add("Ham");

        assertThrows(IndexOutOfBoundsException.class, () -> list.set(-1, "boy"));
    }

    @Test
    public void setInvalidIndexBiggerThanSize() {
        DynamicStringList list = new DynamicStringList();

        list.add("Hi");
        list.add("Bye");
        list.add("Ham");

        assertThrows(IndexOutOfBoundsException.class, () -> list.set(4, "hotdog"));
    }

    @Test
    public void addWithAvailability() {
        DynamicStringList list = new DynamicStringList();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");

        assertEquals(6, list.size());
        assertEquals("five", list.get(4));
    }

    @Test
    public void addWithNoAvailability() {
        DynamicStringList list = new DynamicStringList();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("ten");
        list.add("eleven");

        assertEquals(11, list.size());
        assertEquals("eleven", list.get(10));
        assertEquals(20, list.capacity());
    }

    @Test
    public void addCapacityIncreaseCorrect() {
        DynamicStringList list = new DynamicStringList();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("ten");
        list.add("eleven");

        assertEquals(20, list.capacity());
    }
}
