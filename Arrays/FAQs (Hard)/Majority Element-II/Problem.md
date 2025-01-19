# Majority Element-II

Given an integer array nums of size n. Return all elements which appear more than n/3 times in the array. The output can be returned in any order.

## Examples:
Input: nums = [1, 2, 1, 1, 3, 2]

Output: [1]

Explanation: Here, n / 3 = 6 / 3 = 2.

Therefore the elements appearing 3 or more times is : [1]

Input: nums = [1, 2, 1, 1, 3, 2, 2]

Output: [1, 2]

Explanation: Here, n / 3 = 7 / 3 = 2.

Therefore the elements appearing 3 or more times is : [1, 2]

Input: nums = [1, 2, 1, 1, 3, 2, 2, 3](Give the solution sorted in ascending order)

Output:
[1, 2]

## Constraints:
- n == nums.length.
- 1 <= n <= 105
- -104 <= nums[i] <= 104