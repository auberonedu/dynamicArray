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

        String[] expectedList = {"the", "quick", "red", "fox", "jumped", "over", " the", "lazy", "brown", "dog", "!!"};

        assertArrayEquals(expectedList, stringList);
        assert
    }
    
}