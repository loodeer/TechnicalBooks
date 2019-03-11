# coding=utf-8
# 快速排序 O(n*logn)
# 思想：D&C (分而治之) 典范，递归。
# 最坏情况下，复杂度为 O(n²)
# 最佳情况下，复杂度为 O(n*logn)
# 最佳情况也是平均情况


def quickSort(array):
    if len(array) < 2: # 基线条件，为空或只有一个元素的数组是有序的
        return array
    else:
        pivot = array[0] # 随机挑选一个基准值
        less = [i for i in array[1:] if i <= pivot] # 由所有小于等于基准值的元素组成的子数组
        greater = [i for i in array[1:] if i > pivot] # 有所有大于基准值的元素组成的子数组
        return quickSort(less) + [pivot] + quickSort(greater)

print quickSort([123,324,346,324234,646,34,6,34,1235,46,87])
