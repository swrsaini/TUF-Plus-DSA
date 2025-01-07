# Intersection of two sorted arrays
Given two sorted arrays nums1 and nums2, return an array containing the intersection of these two arrays.
The intersection of two arrays is an array where all values are present in both arrays.

## Try it
https://www.geeksforgeeks.org/problems/intersection-of-two-sorted-array-1587115620/1

## Example 1
Input: nums1 = [1, 2, 2, 3, 5], nums2 = [1, 2, 7]

Output: [1, 2]

Explanation: The elements 1, 2 are the only elements present in both nums1 and nums2

## Example 2
Input: nums1 = [1, 2, 2, 3], nums2 = [4, 5, 7]

Output: []

Explanation: No elements appear in both nums1 and nums2

## Example 3
Input: nums1 = [-45, -45, 0, 0, 2], nums2 = [-50, -45, 0, 0, 5, 7]

Output:
[-45, 0, 0]

## Constraints:
- 1 <= nums1.length, nums2.length <= 1000
- -104 <= nums1[i], nums2[i] <= 104
- Both nums1 and nums2 are sorted in non-decreasing order.