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
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        array[index] = value;
    }

    // add a new value to the end
    @Override
    public void add(String value) {
        if(value == null || value.isEmpty()) {
            throw new NullPointerException("Value cannot be null nor empty!");
        }

        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size] = value;
        size++;

        // // Create a new array with one more element since our original array is fixed.
        // String[] arr = new String[array.length + 1];
        
        // // Copy the original array into the new array
        // System.arraycopy(array, 0, arr, 0, array.length);
        
        // // Add the new element at the end
        // arr[arr.length - 1] = value;

        // // Update the reference to the new array
        // array = arr;
    
        // // Increment the size
        // size++;
    }

    // remove value at a specific index and shift elemnts
    @Override
    public String remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        String removedValue = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1]; // shifts to the left
        }
        array[size - 1] = null; // clears the last element
        size--;
        return removedValue;
    }

    //return the current number
    @Override
    public int size() {
       
        return size;
    }

    // return the capacity of array
    @Override
    public int capacity() {
         return array.length;
    }
}