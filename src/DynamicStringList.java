public class DynamicStringList implements StringList {
  
    private String[] data;
    private int size;
    private int capacity;

    
    public String get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException(); 
        }
        return data[index];
    }

    public void set(int index, String value) {

    }

    public void add(String value) {

    }

    public String remove(int index) {
        return null;
    }
   
    public int size() {
        return size;
    }

    public int capacity() {
        return null;
    }
}
