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




// 5. Size
    public int size(){
        int counter = 0;
        //when defining these, what can I latch onto to simulate the actual datatype/structure later
        for (Integer i : index) {
            if(i != null){
                counter++;
            }
        }
        return counter;
    }






// 6.



    
}
