public class DynamicStringList implements StringList{
    
    private String[] dynamicArray = new String[10];

    public String get(int index) {
        return dynamicArray[index];
    }

    public void set(int index, String value) {
        dynamicArray[index] = value;
    }

    public String remove(int index) {
        dynamicArray[index] = null;
        return dynamicArray[index];
    }

    public int size() {
        return dynamicArray.length;
    }
}
