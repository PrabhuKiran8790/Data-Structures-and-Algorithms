"""
input: [1, 2, 3, 4]
output: [24, 12, 8, 6]
"""


def solve(nums):
    # bruteforce solution
    # O(n^2) and O(n) space
    ans = []
    for i in range(len(nums)):
        prod = 1
        for j in range(0, i):
            prod *= nums[j]
        for k in range(i + 1, len(nums)):
            prod *= nums[k]
        ans.append(prod)

    return ans


def solve2(nums):
    # using prefix and suffix array
    prefix = [1] * len(nums)
    suffix = [1] * len(nums)
    res = []
    for i in range(1, len(nums)):
        prefix[i] = prefix[i - 1] * nums[i - 1]
    for i in range(len(nums) - 2, -1, -1):
        suffix[i] = suffix[i + 1] * nums[i + 1]
    for i in range(len(nums)):
        res.append(prefix[i] * suffix[i])

    return res


def solve3(nums):
    # without using prefix and suffix array
    res = [1]
    for i in range(1, len(nums)):
        res.append(res[i - 1] * nums[i - 1])
    prod = 1
    for i in range(len(nums) - 2, -1, -1):
        prod *= nums[i + 1]
        res[i] *= prod
    return res


def main():
    nums = [1, 2, 3, 4]
    print(solve(nums))
    print(solve2(nums))
    print(solve3(nums))


if __name__ == '__main__':
    main()
