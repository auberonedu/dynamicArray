public class DynamicStringList implements StringList {

    private String[] array = new String[5];
    private int count = 0;

    /**
   * Retrieves the string at the specified index in the list.
   *
   * @param index the index of the string to retrieve.
   * @return the string at the specified index.
   * @throws IndexOutOfBoundsException if the index is out of range (index < 0 or
   *                                   index >= size()).
   */
    public String get(int index) {
        if (index < 0 || index >= size()) {
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
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException();
        }
        array[index] = value;
    }

    /**
   * Adds a new string to the end of the list.
   *
   * @param value the string to add to the list.
   */
    public void add(String value) {
        if(count > size()){
           String[] placeholder = new String[size() + 1];
           for(int i =0; i<size()-1; i++){
            placeholder[i] = array[i];
           }
           placeholder[size()+1] = value;
           array = placeholder;
           count++;
        }
        array[count] = value;
        count++;
    }

    public String remove(int index) {
        return "";
    }

    public int size() {
        return 0;
    }

    public int capacity() {
        return 0;
    }
}
