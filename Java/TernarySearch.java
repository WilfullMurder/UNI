package org.example;

public class TernarySearch
{
    public TernarySearch()
    {

    }

    public int tSearch(int arr[], int start, int end, int key)
    {
        int loopCount = 0;
        while(end > start)
        {
            System.out.println(loopCount++);
            int mid1 = start + (end - 1) / 3;
            int mid2 = end - (end-1) / 3;

            if(arr[mid1] == key)
            {
                System.out.println("Value: " + key + " Found at index: " + mid1);
                System.out.println(loopCount +" loops used");
                return mid1;
            }
            if(arr[mid2] == key)
            {
                System.out.println("Value: " + key + " Found at index: " + mid2);
                System.out.println(loopCount +" loops used");
                return mid2;
            }

            if(key < arr[mid1])
            {
                end = mid1 - 1;
            }
            else if(key > arr[mid2])
            {
                start = mid2 + 1;
            }
            else
            {
                start = mid1 + 1;
                end = mid2 - 1;
            }

        }
        System.out.println("Not Found");
        System.out.println(loopCount +" loops used");
        return -1;
    }

}
