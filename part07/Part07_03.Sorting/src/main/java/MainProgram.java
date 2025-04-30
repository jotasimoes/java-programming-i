
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers));
        MainProgram.sort(numbers);
       
    }

    public static void sort(int[] array) {

        for(int i=0;i<array.length;i++){
           swap(array,i,indexOfSmallestFrom(array,i));
           
           System.out.println(Arrays.toString(array));
        }
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;

    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == (smallest(array))) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestNumber = table[startIndex];
        int indexOfSmallest = startIndex;

        while (startIndex + 1 < table.length) {
            startIndex++;

            if (table[startIndex] < smallestNumber) {
                smallestNumber = table[startIndex];
                indexOfSmallest = startIndex;
            }

        }
        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int auxiliar = array[index1];

        array[index1] = array[index2];
        array[index2] = auxiliar;

    }

}
