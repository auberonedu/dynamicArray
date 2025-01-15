import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicStringListTest {
    @Test
    public void testGet() {
        DynamicStringList word = new DynamicStringList();

            word.add("avocado");
            word.add("orange");
        
        assertEquals("avocado", word.get(3));
        assertEquals("orange", word.get(1));
    }

    @Test
    public void testSet() {
        DynamicStringList word = new DynamicStringList();
        word.add("daffodils");
        word.add("sunflowers");

        word.set(0, "wisteria"); 
        word.set(1, "roses");  
        assertEquals("wisteria", word.get(0));  
        assertEquals("roses", word.get(1));  
    }

    @Test
    public void testAdd() {
        DynamicStringList word = new DynamicStringList();
        word.add("hello");
        word.add("world");

        assertEquals(0, word.size());
}

    @Test
    public void testRemove() {
        DynamicStringList word = new DynamicStringList();
        word.add("a");
        word.add("b");
        word.add("c");
        word.add("d");

        assertEquals(0, word.size());
    }

    @Test 
    public void testSize() {
        DynamicStringList word = new DynamicStringList();
        word.add("8");
        word.add("7");
        word.add("6");
        word.add("5");

        assertEquals(0, word.size());
    }

    @Test
    public void testCapacity() {
        DynamicStringList word = new DynamicStringList();

        assertEquals(0, word.size());
    }
}
