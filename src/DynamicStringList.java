public class DynamicStringList implements StringList {
    private String[] strArray;
    private int size; 

    public DynamicStringList() {
        strArray = new String[10];
        size = 0;
    }

   public String get(int index) {
    return strArray[index];
   }

   public void set(int index, String value) {
    strArray[index] = value;
   }

   public void add(String value) {
    //double array if full
    if (size == strArray.length) {
        String[] newArray = new String[strArray.length * 2];
        for (int i = 0; i < strArray.length; i++) {
            newArray[i] = strArray[i];
        }
        strArray = newArray;
    }
    strArray[size] = value;
    size++;
   }

   public String remove(int index) {
    String removedString = strArray[index];
    strArray[index] = null;
    return removedString;
   }

   public int size() {
    return size;
   }

   public int capacity() {
    return strArray.length;
   }
}
