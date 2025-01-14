import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicStringListTest {

    DynamicStringList stringList = new DynamicStringList();


    // test cases:
    // add 11 items
    // remove from front, end, middle
    // set at front, end, middle
    // check size
    // check capacity

    @Test
    void checkSizeSmall() {
        stringList.add("the");
        stringList.add("quick");
        stringList.add("red");
        stringList.add("fox");
        stringList.add("jumped");
        stringList.add("over");
        stringList.add("the");
        stringList.add("lazy");
        stringList.add("brown");

        int expectedSize = 9;

        assertEquals(expectedSize, stringList.size());
    }
    
    @Test
    void checkSize() {
        stringList.add("the");
        stringList.add("quick");
        stringList.add("red");
        stringList.add("fox");
        stringList.add("jumped");
        stringList.add("over");
        stringList.add("the");
        stringList.add("lazy");
        stringList.add("brown");
        stringList.add("dog");
        stringList.add("!!");

        int expectedSize = 11;

        assertEquals(expectedSize, stringList.size());
    }

    @Test
    void checkCapacitySmall() {
        stringList.add("the");
        stringList.add("quick");
        stringList.add("red");
        stringList.add("fox");
        stringList.add("jumped");
        stringList.add("over");
        stringList.add("the");
        stringList.add("lazy");
        stringList.add("brown");

        int expectedCapacity = 10;

        assertEquals(expectedCapacity, stringList.capacity());
    }

    @Test
    void addElevenStrings() {
        stringList.add("the");
        stringList.add("quick");
        stringList.add("red");
        stringList.add("fox");
        stringList.add("jumped");
        stringList.add("over");
        stringList.add("the");
        stringList.add("lazy");
        stringList.add("brown");
        stringList.add("dog");
        stringList.add("!!");

        String expectedList = "[the, quick, red, fox, jumped, over, the, lazy, brown, dog, !!]";
        // String[] actualList = stringList;

        String testString = stringList.toString();

        assertEquals(expectedList, testString);
    }
    
    @Test
    void removeFirst() {
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("carrot");
        stringList.add("date");
        stringList.remove(0);

        String testString = stringList.toString();
        String expectedList = "[banana, carrot, date]";

        assertEquals(expectedList, testString);
    }

    @Test
    void removeLast() {
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("carrot");
        stringList.add("date");
        stringList.remove(3);

        String testString = stringList.toString();
        String expectedList = "[apple, banana, carrot]";

        assertEquals(expectedList, testString);
    }

    @Test
    void removeMiddle() {
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("carrot");
        stringList.add("date");
        stringList.remove(2);

        String testString = stringList.toString();
        String expectedList = "[apple, banana, date]";

        assertEquals(expectedList, testString);
    }

    @Test
    void setFirst() {
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("carrot");
        stringList.add("date");
        stringList.set(0, "astronaut");

        String testString = stringList.toString();
        String expectedList = "[astronaut, banana, carrot, date]";

        assertEquals(expectedList, testString);
    }

    @Test
    void setLast() {
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("carrot");
        stringList.add("date");
        stringList.set(3, "danger");

        String testString = stringList.toString();
        String expectedList = "[apple, banana, carrot, danger]";

        assertEquals(expectedList, testString);
    }

    @Test
    void setMiddle() {
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("carrot");
        stringList.add("date");
        stringList.set(2, "cat");

        String testString = stringList.toString();
        String expectedList = "[apple, banana, cat, date]";

        assertEquals(expectedList, testString);
    }
}
