public class DynamicStringList implements StringList {
    // instance field(s)
    private String[] array;
    private int size;

    public DynamicStringList() {
        this.array = new String[10];
        this.size = 0;
    }
    
    @Override
    public String get(int index) {
        // DONE
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("index is out of bounds.");
        }
        return array[index];
    }

    @Override
    public void set(int index, String value) {
        // DONE
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        array[index] = value;
    }

    @Override
    public void add(String value) {
        // DONE
        array[size++] = value; // Add the value and increment size
    }

    @Override
    public String remove(int index) {
        // DONE
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("index is out of bounds.");
        }

        String removeVal = array[index];

        for (int i = index; i < size - 1; i++){
            array[i] = array[index + 1];
        }
        
        array[size - 1] = null;
        size--;

        return removeVal;
    }

    @Override
    public int size() {
        // DONE
        return size;
    }

    @Override
    public int capacity() {
        // DONE
        return array.length;
    }
}