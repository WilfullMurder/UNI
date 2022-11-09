class QuickSort:

    def __init__(self):
        pass

    def quickSort(self, arr=[]):
        if len(arr) < 2:
            return arr
        else:
            pivot = arr[0]
            less = [i for i in arr[1:] if i <= pivot]
            greater = [i for i in arr[1:] if i > pivot]
            return self.quickSort(self, less) + [pivot] + self.quickSort(self, greater)
