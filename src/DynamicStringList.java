public class DynamicStringList implements StringList {

    private String array[];
    private int count;

    public DynamicStringList(){
        array = new String[10];
        count = 0;
    }

    //Kim
    /**
     * Retrieves the string at the specified index in the list.
     *
     * @param index the index of the string to retrieve.
     * @return the string at the specified index.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or
     *                                   index >= size()).
     */
    public String get(int index) {
        if (index < 0 || index >= capacity()) {
            throw new IndexOutOfBoundsException();
        }

        return array[index];
    }

    /**
     * Replaces the string at the specified index with the given value.
     *
     * @param index the index of the string to replace.
     * @param value the new value to set at the specified index.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or
     *                                   index >= size()).
     */
    public void set(int index, String value) {
        if (index < 0 || index >= capacity()) {
            throw new IndexOutOfBoundsException();
        }
        array[index] = value;
    }

    // Kim
    /**
     * Adds a new string to the end of the list.
     *
     * @param value the string to add to the list.
     */
    public void add(String value) {
        if (count > capacity()) {
            String[] placeholder = new String[size() + 1];
            for (int i = 0; i < size() - 1; i++) {
                placeholder[i] = array[i];
            }
            placeholder[size() + 1] = value;
            array = placeholder;
            count++;
        }
        array[count] = value;
        count++;
    }

    /**
     * Removes the string at the specified index from the list.
     *
     * @param index the index of the string to remove.
     * @return the string that was removed.
     * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or
     *                                   index >= size()).
     */
    public String remove(int index) {
        if (index < 0 || index >= capacity()) {
            throw new IndexOutOfBoundsException();
        }
        String removedWord = array[index];

        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        count--;
        return removedWord;
    }

    /**
     * Returns the number of strings currently in the list.
     *
     * @return the size of the list.
     */
    public int size() {

        return count;
    }

    // Kim
    public int capacity() {
        return array.length;
    }
}
