public class DynamicStringList implements StringList {

    public DynamicStringList(int length) {
        String[] arr = new String[length];
    }

    // Fields
    public String[] stringArr;

    @Override
    public String get(int index) {
        // For loop - Iteration
        // If statement
        // Return index
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

    }

    @Override
    public void add(String value) {

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
