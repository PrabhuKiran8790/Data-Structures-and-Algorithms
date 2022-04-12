def solve(nums):
    max_sum = nums[0]
    current_sum = 0
    for e in nums:
        if current_sum < 0:
            current_sum = 0
        current_sum += e
        max_sum = max(current_sum, max_sum)
    return max_sum


def main():
    nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
    print(solve(nums))      # 6


if __name__ == '__main__':
    main()
