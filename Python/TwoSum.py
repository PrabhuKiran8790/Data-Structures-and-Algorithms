def solve(nums, target):
    # bruteforce solution
    # O(n^2)
    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            if nums[i] + nums[j] == target:
                return [i, j]
    return [-1, -1]


def solveViaHashMap(nums, target):
    # O(n)
    hashmap = {}
    for i in range(len(nums)):
        diff = target - nums[i]
        if diff in hashmap:
            return [hashmap[diff], i]
        hashmap[nums[i]] = i
    return [-1, -1]


def main():
    arr = [1, 5, 2, 4]
    print(solve(arr, 10))
    print(solveViaHashMap(arr, 6))


if __name__ == '__main__':
    main()
