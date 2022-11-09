package org.example;


import java.util.ArrayList;


public class Main {

    public static void main(String[] args)
    {
        runBinSearch();

    }

    public static void runBinSearch()
    {
        ArrayList<Integer> l = new ArrayList<Integer>()
        {
            {
                add(1);
                add(3214);
                add(6354);
                add(1234);
                add(756);
                add(2354);
                add(436);
                add(2134);

            }
        };
        binSearch bs1 = new binSearch();
        bs1.generateOrderedList(40000000);
        bs1.binSearch(bs1.getList(), 689);

        binSearch bs2 = new binSearch(l);
        bs2.binSearch(bs2.getList(), 756);
    }

    public static void runSelectionSort()
    {
        SelectionSort s = new SelectionSort();
        ArrayList<Integer> l = new ArrayList<Integer>() {
            {
                add(1);
                add(3214);
                add(6354);
                add(1234);
                add(756);
                add(2354);
                add(436);
                add(2134);

            }
        };

        s.selectionSort(l);

    }


}

