import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        };

        int target = 100;

        System.out.println(Arrays.toString(search(matrix , target)));

    }

    // Search in the rows provided between col provided
    public static  int[] binary (int[][] matrix , int row , int cStart , int cEnd , int target) {

        while (cStart <= cEnd) {

            int cMid = cStart + (cEnd - cStart) / 2;
                if (matrix[row][cMid] == target) {
                    return new int[] {row , cMid};
                } else if (matrix[row][cMid] > target) {
                    cEnd = cMid - 1;
                }else {
                    cStart = cMid + 1;
                }

        }

        return new int[] {-1,-1};
    }

    public static int[] search (int[][] matrix , int target) {

        int row = matrix.length;
        int col = matrix[0].length;  // Matrix can be empty

        if (row == 1) {
             return binary(matrix , 0 , 0 , col - 1,target);
        }

        // Run the loop till 2 rows are remaining
        int rStart = 0;
        int rEnd = row - 1;

        int mid = col / 2;

        while (rStart < (rEnd - 1)) {
            int rMid = rStart + (rEnd - rStart) / 2;

            if (matrix[rMid][mid] == target) {
                return new int[] {rMid , mid};
            }
            if (matrix[rMid][mid] < target) {
                rStart = rMid;
            }else {
                rEnd = rMid;
            }

        }

        // now we have two rows once this loop finishes
// check weither the target is in the col of two rows

        if (matrix[rStart][mid] == target) {
            return new int[] {rStart , mid};
        }

        if (matrix[rStart + 1][mid] == target) {
            return new int[] {rStart + 1 , mid};
        }

        // Search in 1st half
if (target <= matrix[rStart][mid - 1]) {
    return binary(matrix,rStart,0,mid - 1,target);
}
        // search in 2nd half
        if (target >= matrix[rStart][mid + 1] && target <= matrix[rStart][col - 1]) {
            return binary(matrix,rStart,mid + 1,col - 1,target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][mid - 1]) {
            return binary(matrix,rStart + 1,0,mid - 1,target);
        }
        //Search in 4th half
        else  {
            return binary(matrix,rStart + 1,mid + 1,col - 1,target);
        }
    }
}