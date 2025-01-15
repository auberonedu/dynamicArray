public class DynamicStringList implements StringList {
  
    private String[] data = new String[10];
    private int size;
    private int capacity;


    public String get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index is out of bounds."); 
        }
        return data[index];
    }

    public void set(int index, String value) {
        if(index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Out of range: " + index);
        } 
        data[index] = value; //update and replace
    }

    public void add(String value) {
        if (size == data.length) {
            data[size] = value;
            size++;
        }
    }

    public String remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Out of range: " + index);
        }

        String remove = data[index];
        data[size - 1] = null;
        size--;
        return remove;
    }
   
    public int size() {
        return size;
    }

    public int capacity() {
        return data.length;
    }
}
