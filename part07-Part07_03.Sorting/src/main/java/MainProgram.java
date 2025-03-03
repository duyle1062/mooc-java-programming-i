
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array) {
        // write your code here
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int indexOfSmallest(int[] array) {
        // write your code here
        int indx = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == MainProgram.smallest(array)) {
                indx = i;
                break;
            }
        }
        return indx;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int indx = startIndex;
        int min = table[startIndex];
        for (int i = startIndex + 1; i < table.length; i++) {
            if (table[i] < min) {
                min = table[i];
            }
        }

        for (int i = startIndex; i < table.length; i++) {
            if (table[i] == min) {
                indx = i;
                break;
            }
        }
        return indx;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, MainProgram.indexOfSmallestFrom(array, i));
        }
    }
}
