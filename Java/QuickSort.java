package org.example;

/**
 * picks an element as a pivot, partitions given array around pivot
 * Always picks the last element as a pivot ~~ no reason
 * Given an array and an element x of an array as the pivot,
 * put x at its correct position in a sorted array,
 * put all elements < x before x, put all elements < x after x.
 */

public class QuickSort
{
    public QuickSort()
    {

    }

    private void swap(int arr[], int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private int partitionArr(int arr[], int low, int high)
    {
        int pivot = arr[high];

        int i = low - 1;

        for(int j = low; j <= high - 1; j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return(i + 1);
    }

    /**
     *
     * @param arr array to sort
     * @param low starting index
     * @param high index to end on
     */
    public void qSort(int arr[], int low, int high)
    {
        if(low < high)
        {
            int pIndex = partitionArr(arr, low, high);

            qSort(arr, low, pIndex - 1);
            qSort(arr, pIndex + 1, high);
        }
    }

    public void printArr(int arr[], int size)
    {

        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}
