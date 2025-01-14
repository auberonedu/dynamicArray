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
    
}
