from typing import List

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        n = len(matrix)        # rows
        m = len(matrix[0])     # columns

        total = n * m
        ans = []
        c = 0

        rowstart = 0
        rowend = n - 1
        colstart = 0
        colend = m - 1

        while c < total:

            # Left -> Right
            for i in range(colstart, colend + 1):
                ans.append(matrix[rowstart][i])
                c += 1
            rowstart += 1

            if c == total:
                break

            # Top -> Bottom
            for i in range(rowstart, rowend + 1):
                ans.append(matrix[i][colend])
                c += 1
            colend -= 1

            if c == total:
                break

            # Right -> Left
            for i in range(colend, colstart - 1, -1):
                ans.append(matrix[rowend][i])
                c += 1
            rowend -= 1

            if c == total:
                break

            # Bottom -> Top
            for i in range(rowend, rowstart - 1, -1):
                ans.append(matrix[i][colstart])
                c += 1
            colstart += 1

        return ans