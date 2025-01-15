public class DynamicStringList implements StringList {
    private String[] strArray;
    private int size; 

    public DynamicStringList() {
        strArray = new String[10];
        size = 0;
    }

    @Override
    public String get(int index) {
        checkIndex(index);
        return strArray[index];
    }

    @Override
    public void set(int index, String value) {
        checkIndex(index);
        strArray[index] = value;
    }

    @Override
    public void add(String value) {
        ensureCapacity();
        strArray[size] = value;
        size++;
    }

    @Override
    public String remove(int index) {
        checkIndex(index);
        String removedString = strArray[index];
        //shift elements to left
        //System.arraycopy(obj src, int srcPos, obj dest, int destPos, int length) (Google search)
        System.arraycopy(strArray, index + 1, strArray, index, size - index - 1);
        //assign null to last element of array after size reduced, protects memory/dangling references (Chat)
        strArray[--size] = null; //--size is pre-decrement operator ie used after -1 applied
        return removedString;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return strArray.length;
    } 

    //helper method to check if index within bounds
    //prevents invalid index access in get/set/remove methods
    //I got the idea for making these two methods 'helper methods' from Chat; (I had been planning to implement the same function within the above methods but that idea made my mouth DRY lol)
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    //helper method to ensure adequate capacity
    private void ensureCapacity() {
        if (size == strArray.length) {
            String[] newArray = new String[strArray.length * 2];
            System.arraycopy(strArray, 0, newArray, 0, strArray.length);
            strArray = newArray;
        }
    }
}
