package HW01;

import java.util.Arrays;

public class HomeWork1 {
    public static void main(String[] args) {

        int[] arr = { 1, 44, 65, 4, 9 };

        printArray(arr);

        pyramidSort(arr);

        printArray(arr);
    
    
    }






    public static void printArray(int[] array) {
        
        System.out.println(Arrays.toString(array));

    }

    public static int[] pyramidSort(int[] array) {
        
        for (int index = array.length / 2 - 1; index >= 0; index--) {
            sifting(array, array.length, index);
        }

        for (int index = array.length - 1; index >= 0; index--) {

            int temp;
            temp = array[0];
            array[0] = array[index];
            array[index] = temp;

            sifting(array, index, 0);
            
        }

        return array;

    }
    



    public static void sifting(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rigthChild = 2 * rootIndex + 2;
        
        if (leftChild < heapSize && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        if (rigthChild < heapSize && array[rigthChild] > array[largest]) {
            largest = rigthChild;
        }

        if (largest != rootIndex) {
            int temp;
            temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            sifting(array, heapSize, largest);
        }
    }
}
