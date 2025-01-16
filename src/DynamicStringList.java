public class DynamicStringList implements StringList {

    // Constructor
    public DynamicStringList(int setSize) {
        this.stringArr = new String[setSize];
    }

    // Fields
    public String[] stringArr;

    // Methods
    @Override
    public String get(int index) {
        String indexValue = " ";

        if (index < 0 || index >= stringArr.length) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = 0; i < stringArr.length; i++) {
                if (i == index) {
                    indexValue = stringArr[i];
                }
            }
        }

        return indexValue;
    }

    @Override
    public void set(int index, String value) {
        if (index < 0 || index >= stringArr.length) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = 0; i > stringArr.length; i++){
                if (i == index){
                    stringArr[i] = value;
                }
            }
        }
    }

    @Override
    public void add(String value) {

        if (stringArr[stringArr.length - 1] != null) {
            String[] newList = new String[stringArr.length * 2];

            for (int i = 0; i < stringArr.length; i++) {
                stringArr[i] = newList[i];
            }

            newList[stringArr.length] = value;

            stringArr = newList;
        }
        else {
            for (int i = 0; i < stringArr.length - 1; i++) {
                if (stringArr[i] == null) {
                    stringArr[i] = value;
                    break;
                }
            }
        }

    }

    @Override
    public String remove(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int capacity() {
        return 0;
    }
}
