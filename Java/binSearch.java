package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class binSearch
{
    private List<Integer> myList = new ArrayList<Integer>();

    public binSearch()
    {

    }

    public binSearch(List<Integer> integerList)
    {
        this.myList = integerList;
        System.out.println("list: " + this.myList);
        this.myList.sort(null);
        System.out.println("Sorted list: " + this.myList);
    }

    public void generateOrderedList(int count)
    {

        for (int i = 0; i < count; i++) {
            myList.add(i);
        }
    }
    public void binSearch(List<Integer> list, int value)
    {
        int low = 0;
        int high = list.size() - 1;
        int loopCount = 0;
        int length = myList.size();

        while(low <= high)
        {
            loopCount++;
            int mid = (low + high) / 2;
            int guess = list.get(mid);
            if(guess == value)
            {
                System.out.println("Found value: " + value);
                System.out.println("list length: " + length);
                System.out.println("Loops to find: " + loopCount);
                return; }
            if(guess > value)
            {

                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }


        }

    }

    public List<Integer> getList()
    {
        return this.myList;
    }
}
