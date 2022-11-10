package org.example;

/**
 * Linear search algorithms even though it's not very useful.
 * ITER is an iterative approach
 * REC is a recursive approach
 * Time complexity: O(N) where N == len
 */

public class LinearSearch
{
    public LinearSearch()
    {

    }

    /**
     * the search function
     * @param arr the array of integers to be searched
     * @param key the desired result
     */
    public static int search_ITER(int arr[], int key)
    {
        int len = arr.length;
        for(int i =0; i < len; i++)
        {
            if(arr[i] == key)
            {
                System.out.println("Found value: " + key + " at index: " + i);
                return i;
            }
        }
        System.out.println("Value: " + key + " Not found");
        return -1;
    }

    public static int search_REC(int arr[], int size, int key)
    {
        if(size == 0)
        {
            System.out.println("Value: " + key + " Not found");
            return -1;
        }
        else if (arr[size-1] == key)
        {
            System.out.println("Found value: " + key + " at index: " + (size-1));
            return size - 1;
        }
        else
        {
            return search_REC(arr, size - 1, key);
        }
    }
}
