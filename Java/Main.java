package org.example;


import java.util.ArrayList;


public class Main {

    public static void main(String[] args)
    {
        //runLinearSearch();
        //runBinSearch();
        //runSelectionSort();
        //runQSort();



    }

    public static void runQSort()
    {
        QuickSort qs1 = new QuickSort();
        int[] arr = generateNewMixedArr(15);
        qs1.printArr(arr, arr.length);
        qs1.qSort(arr,0,arr.length-1);
        qs1.printArr(arr, arr.length);
    }

    public static void runBinSearch()
    {
        binSearch bSearch = new binSearch();
        int[] arr = generateNewArr(15);

        bSearch.search_ITER(arr, 5);
        bSearch.search_REC(arr, 0,arr.length - 1, 5);

    }

    public static void runSelectionSort()
    {
        SelectionSort s = new SelectionSort();
        int[] arr = generateNewArr(15);
        s.printArr(arr);
        s.sort(arr);
        s.printArr(arr);

    }

    public static void runLinearSearch()
    {
        int[] arr = generateNewArr(15);
        LinearSearch lSearch1 = new LinearSearch();
        lSearch1.search_ITER(arr, 5);
        int[] arr2 = generateNewArr(15);
        lSearch1.search_REC(arr2, arr2.length, 2134);
    }

    public static int[] generateNewArr(int count)
    {
        int arr[] = new int[count];
        for(int i = 0; i < arr.length; i++)
        {
            if(i % 2 == 0){arr[i] = ((i + 1) * 9) / 5;}
        }
        return arr;
    }

    public static int[] generateNewMixedArr(int count)
    {
        int arr[] = new int[count];
        for(int i = 0; i < arr.length; i++)
        {
            if(i % 2 == 0){arr[i] = ((i + 1) * 9) / 5;}
        }
        return arr;
    }

}

