import java.util.Arrays;
public class DynamicStringList implements StringList {

    
    private String[] stringArray = new String[10];
    private int size = 0;
    private int capacity = 10;


    /**
     * Retrieves the string at the specified index in the list.
     *
     * @param index the index of the string to retrieve.
     * @return the string at the specified index.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
     */
    public String get(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
        }
        return stringArray[index];
    }

    /**
     * Replaces the string at the specified index with the given value.
     *
     * @param index the index of the string to replace.
     * @param value the new value to set at the specified index.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
     */
    public void set(int index, String value){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
        }
        stringArray[index] = value;
    }

    /**
     * Adds a new string to the end of the list.
     *
     * @param value the string to add to the list.
     */
    public void add(String value){
        if (size == capacity) {
            //  double capacity
            capacity *= 2;
            // plug in arr at first size locations
            stringArray = Arrays.copyOf(stringArray, capacity);
            stringArray[size] = value;
            size++;
        } else {
            stringArray[size] = value;
            size++;
        }
    }

    /**
     * Removes the string at the specified index from the list.
     *
     * @param index the index of the string to remove.
     * @return the string that was removed.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
     */
    public String remove(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
        }
        String removed = stringArray[index];
        for(int i = size; i >= index; i--){
            stringArray[i] = stringArray[i+1];
        }
        size--;
        return removed;
    }

    /**
     * Returns the number of strings currently in the list.
     *
     * @return the size of the list.
     */
    public int size(){
            return size;
    }

    /**
     * Returns the current capacity of the list (i.e., the number of elements it can hold before resizing).
     *
     * @return the capacity of the list.
     */
    public int capacity(){
            return capacity;
    }

    @Override
    public String toString(){
        String arrayString = "[";
        for (int i = 0; i <= size; i ++){
            arrayString += stringArray[i] + ", ";
        }
        return arrayString.substring(0, arrayString.length() - 2) + "]";
    }

}