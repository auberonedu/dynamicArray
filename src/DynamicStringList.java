public class DynamicStringList implements StringList {
    private String[] array;
    private int size;

    // constructor
    public DynamicStringList(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Initial capacity must be greather than 0");
        }
        array = new String[initialCapacity];
        size = 0;
    }

    // get a value of a specific index
    @Override
    public String get(int index) {
        if(index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index out of bounderies: " + index);
        }
        return array[index];
    }
    
    // replace the value of a specific index
    @Override
    public void set(int index, String value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }
        array[index] = value;
    }

    // add a new value to the end
    @Override
    public void add(String value) {
     
    }

    // remove value at a specific index and shift elemnts
    @Override
    public String remove(int index) {

    }

    //return the current number
    @Override
    public int size() {
        return size;
    }

    // return the capacity of array
    @Override
    public int capacity() {
        
    }
}

