def solve(nums):
    seen = set()
    for e in nums:
        if e in seen:
            return True
        seen.add(e)
    return False


def main():
    nums = [1, 2, 3, 1]
    print(solve(nums))


if __name__ == '__main__':
    main()
