class SelectionSort:
    loopCount = 0

    def __init__(self):
        pass

    def findSmallest(self, arr=[]):
        smallest = arr[0]
        smallestIndex = 0
        for i in range(len(arr)):
            if arr[i] < smallest:
                self.loopCount += 1
                smallest = arr[i]
                smallestIndex = i
        return smallestIndex

    def selectionSort(self, arr=[]):
        print("Sorting array: ", arr)
        newArr = []
        for i in range(len(arr)):
            smallest = self.findSmallest(self, arr)
            newArr.append(arr.pop(smallest))
        print("Sorted Array: ", newArr)
        print("Loops to sort: ", self.loopCount)
