public class DynamicStringList implements StringList {

    private String myArr[];
    private int size;

    public DynamicStringList() {
        myArr = new String[10];
        size = 0;
    };

    @Override
    public String get(int index) {

        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }

        return myArr[index];
    }

    @Override
    public void set(int index, String value) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        myArr[index] = value;
    }

    @Override
    public void add(String value) {
        if (size == myArr.length) {
            // create a new array double the length
            // copy values to new array with 2x capacity
            String[] myArr2 = new String[myArr.length * 2];

            for (int i = 0; i < myArr.length; i++) {
                myArr2[i] = myArr[i];
                size++;
            }

            myArr = myArr2;
        }
        // set value to end of the array
        myArr[size] = value;
        size++;
    }

    @Override
    public String remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index is out of range");
        }
        String removedString = myArr[index];
        size--;
        return removedString;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return myArr.length;
    }
}
