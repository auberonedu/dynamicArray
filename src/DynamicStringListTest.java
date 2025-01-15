import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DynamicStringListTest {

    @Test
    public void stringListGetTest() {
        DynamicStringList list = new DynamicStringList();

        String[] myArr = {"Red", "Green", "Blue", "Orange"};

        for(String colors : myArr){
            list.add(colors);
        }

        assertEquals("Red", list.get(0) );


    }
}