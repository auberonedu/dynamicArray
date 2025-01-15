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
}
