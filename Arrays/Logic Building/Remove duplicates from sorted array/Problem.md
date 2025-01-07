# Remove duplicates from sorted array
Given an integer array nums sorted in non-decreasing order, remove all duplicates in-place so that each unique element appears only once. Return the number of unique elements in the array. If the number of unique elements be k, then, Change the array nums such that the first k elements of nums contain the unique values in the order that they were present originally. The remaining elements, as well as the size of the array does not matter in terms of correctness.

An array sorted in non-decreasing order is an array where every element to the right of an element in either equal to or greater in value than that element.

## Try it
https://leetcode.com/problems/remove-duplicates-from-sorted-array/


## Example 1
Input: nums = [0, 0, 3, 3, 5, 6]

Output: [0, 3, 5, 6, _, _]

Explanation: There are 4 distinct elements in nums and the elements marked as _ can have any value.

## Example 2
Input: nums = [-2, 2, 4, 4, 4, 4, 5, 5]

Output: [-2, 2, 4, 5, _, _, _, _]

Explanation: There are 4 distinct elements in nums and the elements marked as _ can have any value.

## Example 3
Input: nums = [-30, -30, 0, 0, 10, 20, 30, 30]

Output:
[-30, 0, 10, 20, 30, _, _, _]

## Constraints:
- 1 <= nums.length <= 105
- -104 <= nums[i] <= 104
- nums is sorted in non-decreasing order.