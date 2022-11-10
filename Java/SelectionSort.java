package org.example;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

/**
 * sorts an array by repeatedly finding the minimum element (considering ascending order)
 * from the unsorted part and putting it at the beginning.
 * maintains two subarrays in a given array:
 *     The subarray which already sorted.
 *     The remaining subarray was unsorted.
 *     every iteration, the minimum element (considering ascending order)
 *     from the unsorted subarray is picked and moved to the sorted subarray.
 */
public class SelectionSort
{
    public SelectionSort()
    {

    }

    public void sort(int arr[])
    {
        int length = arr.length;

        for(int i =0; i < length - 1; i++)
        {
            int smallestIndex = i;
            for(int j = i+1; j < length; j++)
            {
                if(arr[j] < arr[smallestIndex]){smallestIndex = j;}
            }


            int tmp = arr[smallestIndex];
            arr[smallestIndex] = arr[i];
            arr[i] = tmp;
        }
    }

    public void printArr(int arr[])
    {
        int length = arr.length;
        for(int i = 0; i < length; i++)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }


}
