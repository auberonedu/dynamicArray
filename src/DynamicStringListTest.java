import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class DynamicStringListTest {
    @Test
    void testAdd() {
        // Arrange
        DynamicStringList addTest = new DynamicStringList(12);

        // Act
        addTest.add("Hello");

        // Assert
        assertEquals("Hello", addTest.get(0));
    }

    @Test
    void testAddAtCapacity() {
        // Arrange
        DynamicStringList addAtCapacityTest = new DynamicStringList(2);
        // Act
        addAtCapacityTest.add("Hello");
        addAtCapacityTest.add("Test");
        addAtCapacityTest.add("Derp");
    
        // Assert
        assertEquals("[Hello, Test, Derp, null]", Arrays.toString(addAtCapacityTest.stringArr));
    }

    @Test
    void testCapacity() {
        // Arrange 
        DynamicStringList testCapacityTestArray = new DynamicStringList(0) ;

        // Act
        testCapacityTestArray.add("hello");

        // Assert
        assertEquals(1, testCapacityTestArray.capacity());
    }

    @Test
    void testGet() {
        // Arrange
        DynamicStringList getTest = new DynamicStringList(3);

        // Act
        getTest.add("Hello");
        getTest.add("Test");
        getTest.add("Grr");


        // Assert
        assertEquals("Hello", getTest.get(0));
        assertEquals("Test", getTest.get(1));
        assertEquals("Grr", getTest.get(2));

    }

    @Test
    void testRemove() {

    }

    @Test
    void testSet() {

    }

    @Test
    void testSize() {

    }
}
