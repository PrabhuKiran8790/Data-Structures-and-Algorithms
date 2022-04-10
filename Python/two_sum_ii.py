# find the pairs which sum upto the target when the input array is sorted
def solve(nums, target):
    i, j = 0, len(nums) - 1
    while i < j:
        _sum = nums[i] + nums[j]
        if _sum < target:
            i += 1
        if _sum > target:
            j -= 1
        if _sum == target:
            return [i, j]
    return [-1, -1]


def main():
    arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    print(solve(arr, 50))  # [5, 8]


if __name__ == '__main__':
    main()
