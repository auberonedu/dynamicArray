public class DynamicStringList implements StringList{
    
    private String[] dynamicArray = new String[10];
    private int counter = 0;

    public String get(int index) {
        return dynamicArray[index];
    }
}
