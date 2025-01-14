public class DynamicStringList implements StringList {
    // instance field(s)
    private String[] array;
    private int size;
    
    @Override
    public String get(int index) {
        // DONE
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("index out of bounds.");
        }
        return array[index];
    }

    @Override
    public void set(int index, String value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

    @Override
    public void add(String value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public String remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int size() {
        // DONE
        return size;
    }

    @Override
    public int capacity() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'capacity'");
    }
}