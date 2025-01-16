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
            String[] newList = new String[this.size() * 2];

            for (int i = 0; i < stringArr.length; i++) {
                newList[i] = stringArr[i];
            }

            newList[stringArr.length] = value;

            this.stringArr = newList;
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
        if (index < 0 || index >= stringArr.length) {
            throw new IndexOutOfBoundsException();
        } else {
            String removedString = "";
            for (int i = 0; i < stringArr.length; i++) {
                if (i == index){
                    removedString = stringArr[i];
                    stringArr[i] = null;
                }
                if (stringArr[i] == null){
                    stringArr[i] = stringArr[i+1];
                    stringArr[i+1] = null;
                }
            }
            return removedString;
        }   
    }

    @Override
    public int size() {
        int sizeCounter = 0;

        for(int i = 0; i < stringArr.length; i++) {
            if (stringArr[i] != null) {
                sizeCounter++;
            }
        }
        return sizeCounter;
    }

    @Override
    public int capacity() {
        return stringArr.length;
    }
}
