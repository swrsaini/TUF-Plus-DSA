# Pascal's Triangle
Given an integer numRows return the first numRows rows of Pascal's triangle.

In Pascal's triangle:

- The first row has one element with a value of 1.
- Each row has one more element in it than its previous row.
- The value of each element is equal to the sum of the elements directly above it when arranged in a triangle format.

## Examples:
Input: numRows = 4

Output: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1]]

Explanation: 1st Row has its value set to 1.

All other cells take their value as the sum of the values directly above them

Input: numRows = 5

Output: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]

Explanation: 1st Row has its value set to 1.

All other cells take their value as the sum of the values directly above them

Input: numRows = 3

Output:

## Constraints:
1 <= numRows <= 30