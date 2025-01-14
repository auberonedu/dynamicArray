public class DynamicStringList implements StringList {
    // instance field(s)
    private String[] array;
    private int size;
    
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public String remove(int index) {
        // TODO Auto-generated method stub
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("index is out of bounds.");
        }

        String removeVal = array[index];

        for (int i = index; i < size - 1; i++){
            array[i] = array[index++];
        }
        
        array[--size] = null;
        --size;

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