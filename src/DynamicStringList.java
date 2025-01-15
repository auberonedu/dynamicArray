public class DynamicStringList implements StringList {
    private String[] arr;
    private int index;

    // Constructor


    // The array length should be X amout but the content of it shuold all be set to null;
    public DynamicStringList() {
        arr = new String[10];
        int index = 0;
    }

    // 1.
    public String get(int index) {
       
    }

    // 2.
    public void set(int index, String value) {

    }

    // 3.
    public void add(String value) {

    }




// 4.
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
public int capacity(){
    return arr.length;
}



    
}
