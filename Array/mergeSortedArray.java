package Array;/*.............. Merge Sorted Arrays ..............*/
// merge two sorted arrays so that final result is a merged sorted array.
// example: [0,3,4,31] and [4,6,30] when merged gives output:
// [0, 3, 4, 4, 6, 30, 31]

import java.util.Arrays;

public class mergeSortedArray {
    private int[] merge (int[] array1, int[] array2) {
        int l1 = array1.length;
        int l2 = array2.length;

        int[] mergedArray = new int[l1+l2];

        //check input
        if(l1 == 0 && l2 ==0 )  return null;
        if(l1 == 0) return array2;
        if(l2 == 0) return array1;

        int j = 0; //array1 index
        int k = 0; //array2 index
        int i = 0; // mergedArray index

        while (j < l1 && k < l2) {
            if(array1[j] < array2[k]) {
                mergedArray[i] = array1[j];
                j++;
            } else {
                mergedArray[i] = array2[k];
                k++;
            }
            i++;
        }


        while(j < l1) {
            mergedArray[i] = array1[j];
            j++;
            i++;
        }

        while(k < l2) {
            mergedArray[i] = array2[k];
            k++;
            i++;
        }

        return mergedArray;
    }

    private int[] merge2 (int[] array1, int[] array2) {
        int l1 = array1.length;
        int l2 = array2.length;

        int[] mergedArray = new int[l1+l2];

        //check input
        if(l1 == 0 && l2 ==0 )  return null;
        if(l1 == 0) return array2;
        if(l2 == 0) return array1;

        int j = 0; //array1 index
        int k = 0; //array2 index
        int i = 0; // mergedArray index


        while (j < l1 || k < l2) {
            //here k == l2 should in front of array1[j] < array2[k],otherwise out of bound err
            if(j < l1 && ( k == l2 || array1[j] < array2[k])) {
                mergedArray[i] = array1[j];
                j++;
            } else {
                mergedArray[i] = array2[k];
                k++;
            }
            i++;
        }

        return mergedArray;
    }

    public static void main (String[] args) {
        mergeSortedArray mergedSortedArray = new mergeSortedArray();
        int[] array1 = {1,2,5};
        int[] array2 = {-1};
        int[] mergedArray = mergedSortedArray.merge(array1,array2);
        int[] mergedArray2 = mergedSortedArray.merge2(array1,array2);
        System.out.println(Arrays.toString(mergedArray));
        System.out.println(Arrays.toString(mergedArray2));

    }
}
