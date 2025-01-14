public class DynamicStringList implements StringList{
    
    private String[] dynamicArray = new String[10];

    public String get(int index) {
        return dynamicArray[index];
    }
}
