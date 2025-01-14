public class DynamicStringList implements StringList{
    
    private String[] dynamicArray = new String[10];
    private int currentIndex = 0;

    public String get(int index) {
        if (index < 0 || index > dynamicArray.length) {
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
        dynamicArray[currentIndex] = value;
        currentIndex++;
    }

    public int size() {
        int count = 0;
        for (int i = 0; i < dynamicArray.length; i++) {
            if (dynamicArray[i] != null) {
                count++;
            }
        }
        return count;
    }
}
