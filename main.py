import BinSearch
import QuickSort
import SelectionSort


def main():
    ##runBinSearch()
    ##runSelectionSort()
    runQuickSort()

    pass



def runBinSearch():
    B1 = BinSearch.BinSearch
    B1.genOrderedList(B1, 1000)
    B1.binSearch(B1, B1.myList, 221)

    myList = genArray(100)

    B2 = BinSearch.BinSearch
    B2.__init__(B2, myList)
    B2.binSearch(B2, B2.myList, 36)


def runSelectionSort():
    S1 = SelectionSort.SelectionSort
    myList = genArray(100)

    S1.selectionSort(S1, myList)

def runQuickSort():
    q1 = QuickSort.QuickSort
    myList = genArray(100)
    print("List to sort: ", myList)
    print(q1.quickSort(q1, myList))


def genArray(count=0):
    myList = []
    for i in range(count):
        if i % 2 == 0:
            ##adds all even numbers to array
            myList.append(i)
        else:
            ##manipulates all odd values for some minor randomisation and adds them into array
            myList.append((i * 9) // 5)
    return myList

main()