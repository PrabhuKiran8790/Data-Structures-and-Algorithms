def solve(nums):
    start, end = 0, len(nums)
    while start < end:
        mid = start + (end - start) // 2
        if nums[mid] < nums[mid + 1]:
            start = mid + 1
        if nums[mid] > nums[mid + 1]:
            end = mid

    return start


def main():
    nums = [1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 3, 2]
    print(solve(nums))


if __name__ == '__main__':
    main()
