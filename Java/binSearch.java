package org.example;
/**
 * Binary search algorithms.
 * ITER is an iterative approach
 * REC is a recursive approach
 * Time complexity: O(log n) where N == len
 */


public class binSearch
{

    private int loopCount_REC;
    public binSearch()
    {
        this.loopCount_REC = 0;

    }

    public int search_ITER(int arr[], int key)
    {
        if (arr[0] == key)
        {
            System.out.println("Value: " + key + "Found at index: 0");
            System.out.println("0 loops used");
        }
        int low = 0;
        int high = arr.length - 1;
        int loopCount = 0;
        while (high - low > 1)
        {
            loopCount++;
            int mid = (high + low) / 2;
            if (arr[mid] > key)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        if (arr[high] == key)
        {
            System.out.println("Value: " + key + " Found at index: " + high);
            System.out.println(loopCount +" loops used");
            return high;
        }
        else if (arr[low] == key)
        {
            System.out.println("Value: " + key + " Found at index: " + low);
            System.out.println(loopCount +" loops used");
            return low;
        }
        else
        {
            System.out.println("Not Found");
            System.out.println(loopCount +" loops used");
            return -1;
        }
    }

    public int search_REC(int arr[], int low, int high, int key)
    {
        if(high >= 1)
        {
            loopCount_REC++;
            int mid = low + (high-1)/2;

            if(arr[mid] == key)
            {
                System.out.println("Value: " + key + " Found at index: " + mid);
                System.out.println(this.loopCount_REC +" loops used");
                return mid;
            }

            if(arr[mid] > key)
            {
                return search_REC(arr, low, mid-1, key);
            }
            return search_REC(arr, mid+1, high, key);


        }
        System.out.println("Not Found");
        System.out.println(this.loopCount_REC +" loops used");
        return -1;
    }


}