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
    # resetting start and end
    start, end = 0, len(nums)
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
