public class DynamicStringList implements StringList {

    String[] array = new String[5];

    public String get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }

        return array[index];
    }

    public void set(int index, String value) {

    }

    public void add(String value) {

    }

    public String remove(int index) {
        return "";
    }

    public int size() {
        return 0;
    }

    public int capacity() {
        return 0;
    }
}
