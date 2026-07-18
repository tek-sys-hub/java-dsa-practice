public class Main {

    // https://leetcode.com/problems/search-a-2d-matrix/

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11,12,13,14,15}
        };

        int target = 16;

        boolean isFound = searchMatrix(matrix , target);

        System.out.println(isFound);

    }

    public static boolean searchMatrix(int[][] matrix, int target) {

            if (matrix == null || matrix.length ==0) {
                return false;
            }

            int m = matrix.length;
            int n = matrix[0].length;

            int startRow = 0;
            int endRow = m - 1;

            while (startRow <= endRow){
                int midRow = startRow + (endRow - startRow) / 2;

                if (target >= matrix[midRow][0] && target <= matrix[midRow][n-1]) {
                    // Found the element row
                        return searchItem(matrix , target , midRow);
                } else if (target > matrix[midRow][n-1]) {
                    // Shift to the down row
                    startRow = midRow + 1;
                }else{
                    // WE will move to the upper row
                    endRow = midRow - 1;
                }

            }

        return false;
    }

    public static boolean searchItem (int[][] matrix, int target , int midRow) {

        int n = matrix[0].length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (matrix[midRow][mid] == target) {
                return true;
            }else if (matrix[midRow][mid] > target) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }

        return false;
    }
}