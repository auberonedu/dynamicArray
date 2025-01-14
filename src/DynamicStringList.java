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
        String result = "Error";
        try {
            return stringArray[index];
            } catch (IndexOutOfBoundsException error) {
            System.out.println("Error: " + error);
        }
        return result;
    }

    /**
     * Replaces the string at the specified index with the given value.
     *
     * @param index the index of the string to replace.
     * @param value the new value to set at the specified index.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or index >= size()).
     */
    public void set(int index, String value){

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
        String removed = "error";
        try {
            removed = stringArray[index];
            for(int i = size; i >= index; i--){
                stringArray[i] = stringArray[i+1];
            }
            size--;
            
        } catch (IndexOutOfBoundsException error){
            System.out.println(error);
        }
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

}