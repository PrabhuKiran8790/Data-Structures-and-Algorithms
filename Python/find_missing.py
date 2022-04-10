def solve(nums):
    """
    given an array of integers from 0 to n, find the missing number in the array
    """
    n = len(nums)
    n = len(nums)
    return n * (n + 1) // 2 - sum(nums)


def solve2(nums):
    # using cyclic sort
    i = 0
    while i < len(nums):
        correct = nums[i]
        if nums[i] < len(nums) and nums[i] != nums[correct]:
            nums[i], nums[correct] = nums[correct], nums[i]
        else:
            i += 1

    for i in range(len(nums)):
        if nums[i] != i:
            return i
    return -1


def main():
    nums = [1, 0, 3]
    print(solve(nums))
    print(solve2(nums))


if __name__ == '__main__':
    main()
