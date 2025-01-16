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

    }

    @Test
    void testGet() {

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
