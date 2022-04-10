# find first and last index of a number in a sorted array

def solve(nums, target):
    index = [-1, -1]
    start, end = 0, len(nums)
    while start <= end:
        mid = start + (end - start) // 2
        if nums[mid] >= target:
            end = mid - 1
        else:
            start = mid + 1
        if nums[mid] == target:
            index[0] = mid

    # if index[0] is -1, it means, the target element is not found. so no need to search for last index
    if index[0] == -1:
        return index

    # resetting start and end (start will be from the index of 1st occurrence)
    start, end = index[0], len(nums)

    while start <= end:
        mid = start + (end - start) // 2
        if nums[mid] <= target:
            start = mid + 1
        else:
            end = mid - 1
        if nums[mid] == target:
            index[1] = mid
    return index


def main():
    nums = [1, 2, 3, 4, 4, 4, 4, 5, 6, 6, 7, 7, 7, 8]
    print(solve(nums, 4))   # [3, 6]


if __name__ == '__main__':
    main()
