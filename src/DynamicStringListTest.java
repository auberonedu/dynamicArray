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
        // Arrange
        DynamicStringList getTest = new DynamicStringList(3);

        // Act
        getTest.add("Hello");
        getTest.add("Test");
        getTest.add("Grr");
        String removed = getTest.remove(1);


        // Assert
        assertEquals("Hello", getTest.get(0));
        assertEquals(null, getTest.get(1));
        assertEquals("Grr", getTest.get(2));
        assertEquals("Test", removed);

    }

    @Test
    void testSet() {
        // Arrange
        DynamicStringList setTest = new DynamicStringList(3);

        // Act
        setTest.add("Hello");
        setTest.add("Test");
        setTest.add("Grr");
        setTest.set(1, "Derp");

        // Assert
        assertEquals("Hello", setTest.get(0));
        assertEquals("Derp", setTest.get(1));
        assertEquals("Grr", setTest.get(2));

    }

    @Test
    void testSize() {

    }
}
