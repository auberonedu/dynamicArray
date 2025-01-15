public class DynamicStringList implements StringList {
    private String[] arr;
    private int size;

    // Constructor
    public DynamicStringList() {
        arr = new String[10];
        size = 0;
    }

    // 1. 
    @Override
    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
        return arr[index];
    }

    // 2. 
    @Override
    public void set(int index, String value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
        arr[index] = value;
    }

    // 3. 
    @Override
    public void add(String value) {
        if (size == arr.length) {
            resize();
        }
        arr[size++] = value;
    }

    // 4. 
    @Override
    public String remove(int index){
        String removed = "";
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == arr[index]){
                removed = arr[i];
                arr[index] = null;
            }
        }
        return removed;
    }

    // 5. Size
    @Override
    public int size(){
        int counter = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != null){
                counter++;
            }
        }
        return counter;
    }

    // 6.
    @Override
    public int capacity(){
        return arr.length;
    }

    // Helper method
    private void resize() {
        String[] newArr = new String[arr.length * 2];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
}
