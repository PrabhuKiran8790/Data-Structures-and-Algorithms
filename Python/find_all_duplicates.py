"""
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer
appears once or twice, return an array of all the integers that appears twice.
"""


def solve(nums):
    # using set
    set_list = set()
    ans = []
    for e in nums:
        if e not in set_list:
            set_list.add(e)
        else:
            ans.append(e)
    return ans


def solve2(nums):
    # using cyclic sort
    ans = []
    i = 0
    while i < len(nums):
        correct = nums[i]-1
        if nums[i] != nums[correct]:
            nums[i], nums[correct] = nums[correct], nums[i]
        else:
            i += 1

    for i in range(len(nums)):
        if nums[i] != i+1:
            ans.append(nums[i])

    return ans


def main():
    nums = [4, 3, 2, 7, 8, 2, 3, 1]
    print(solve(nums))
    print(solve2(nums))


if __name__ == '__main__':
    main()
