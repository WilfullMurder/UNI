class BinSearch:
    myList = []

    def __init__(self):
        pass

    def __init__(self, integerList=[]):
        self.myList = integerList
        print("List: ", self.myList)
        self.myList.sort()
        print("Sorted list: ", self.myList)

    def genOrderedList(self, count=0):
        for i in range(count):
            self.myList.append(i)

    def binSearch(self, intList=[], val=0):
        low = 0
        high = len(intList) - 1
        loopCount = 0
        length = len(intList)

        while low <= high:
            loopCount += 1
            mid = (low + high) // 2
            guess = intList[mid]
            if guess == val:
                print("Found value: ", val)
                print("List length: ", length)
                print("Loops to find: ", loopCount)
                return
            if guess > val:
                high = mid - 1
            else:
                low = mid + 1
        print("Value: ", val, "Not found!!")