import java.util.Arrays;

public class DynamicStringList implements StringList {
    
    private String[] stringArray = new String[10];
    private int size;

    public String get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        
        return stringArray[index];
    }

    public void set(int index, String value) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        stringArray[index] = value;
    }

    public void add(String value) {
        if (size == stringArray.length) {
            stringArray = Arrays.copyOf(stringArray, stringArray.length + 1);
            stringArray[size] = value;
            size++;
        } else {
            stringArray[size] = value;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return stringArray.length;
    }
}