# Merge Sorting
Given an array of integers, nums,sort the array in non-decreasing order using the merge sort algorithm. Return the sorted array.
A sorted array in non-decreasing order is one in which each element is either greater than or equal to all the elements to its left in the array.

## Try it
https://www.geeksforgeeks.org/problems/merge-sort/1

## Example 1
Input: nums = [7, 4, 1, 5, 3]

Output: [1, 3, 4, 5, 7]

Explanation: 1 <= 3 <= 4 <= 5 <= 7.

Thus the array is sorted in non-decreasing order.

## Example 2
Input: nums = [5, 4, 4, 1, 1]

Output: [1, 1, 4, 4, 5]

Explanation: 1 <= 1 <= 4 <= 4 <= 5.

Thus the array is sorted in non-decreasing order.

## Example 3
Input: nums = [3, 2, 3, 4, 5]

Output:
[2, 3, 3, 4, 5]

## Constraints:
- 1 <= nums.length <= 106
- -104 <= nums[i] <= 104
- nums[i] may contain duplicate values.