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

    @Test
    public void removeValidIndex() {
        DynamicStringList list = new DynamicStringList();

        list.add("Potato");
        list.add("Tomato");
        list.add("Avocado");

        assertEquals("Avocado", list.remove(2));
    }

    @Test
    public void removeInvalidIndex() {
        DynamicStringList list = new DynamicStringList();

        list.add("Potato");
        list.add("Tomato");
        list.add("Avocado");

        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(-1));
    }

    @Test
    public void removeOutOfBounds() {
        DynamicStringList list = new DynamicStringList();

        list.add("Potato");
        list.add("Tomato");
        list.add("Avocado");

        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(10));
    }

    @Test
    public void size() {
        DynamicStringList list = new DynamicStringList();

        list.add("Potato");
        list.add("Tomato");
        list.add("Avocado");

        assertEquals(3, list.size());
    }

    @Test
    public void sizeEmpty() {
        DynamicStringList list = new DynamicStringList();

        assertEquals(0, list.size());
    }

    @Test
    public void capacity() {
        DynamicStringList list = new DynamicStringList();
        
        assertEquals(10, list.capacity());

        list.add("Potato");
        list.add("Tomato");
        list.add("Avocado");
        
        assertEquals(10, list.capacity());

        // trigger expansion
        for (int i = 0; i < 10; i++) {
            list.add("Food - " + i);
        }

        assertEquals(20, list.capacity());
    }

    @Test
    public void capacityDoubling() {
        DynamicStringList list = new DynamicStringList();
        
        assertEquals(0, list.size());
        assertEquals(10, list.capacity());

        // trigger expansion
        for (int i = 0; i < 11; i++) {
            list.add("Food - " + i);
        }
        
        assertEquals(11, list.size());
        assertEquals(20, list.capacity());

        // trigger another expansion
        for (int i = 0; i < 11; i++) {
            list.add("Food - " + i);
        }

        assertEquals(22, list.size());
        assertEquals(40, list.capacity());

        // trigger another expansion
        for (int i = 0; i < 51; i++) {
            list.add("Food - " + i);
        }

        assertEquals(73, list.size());
        assertEquals(80, list.capacity());
    }
}