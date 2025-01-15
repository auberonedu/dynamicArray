public class DynamicStringList implements StringList {

    private String myArr[];
    private int size;

    public DynamicStringList() {
        myArr = new String[10];
        size = 0;
    };
    
    @Override
  public String get(int index) {


    if(index < 0 || index >= size()){
        throw new IndexOutOfBoundsException("Index is out of range");
        }

        return myArr[index]; 
    }


    @Override
    public void set(int index, String value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

    @Override
    public void add(String value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public String remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public int capacity() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'capacity'");
    }


    
}
