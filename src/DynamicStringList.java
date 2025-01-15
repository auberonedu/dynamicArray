public class DynamicStringList implements StringList{
    
    private String[] dynamicArray = new String[10];
    private int currentIndex = 0;

    public String get(int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return dynamicArray[index];
    }

    public void set(int index, String value) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        dynamicArray[index] = value;
    }

    public void add(String value) {
        if (size() == capacity()) {
            String[] biggerArray = new String[capacity() * 2]; // double it every time it is filled

            for (int i = 0; i < size(); i++) {
                biggerArray[i] = dynamicArray[i];
            }

            dynamicArray = biggerArray;
            dynamicArray[currentIndex] = value;
            
        } else {
            dynamicArray[currentIndex] = value;
        }
        currentIndex++;
    }

    public String remove(int index) {
        if (index < 0 || index > dynamicArray.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        String removed = dynamicArray[index];
        dynamicArray[index] = null;
        return removed;
    }

    public int size() {
        return currentIndex;
    }

    public int capacity() {
        return dynamicArray.length;
    }
}
