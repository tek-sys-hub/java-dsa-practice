public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int target = 20;

        boolean isFound = searchMatrix(matrix , target);
        System.out.println(isFound);

    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length; // Row
        int n = matrix[0].length; // Columns
int row = 0;
int col = n -1;

            while (row < m && col >= 0) {

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row ++;
            }
            else {
                col --;
            }

            }

        return false;
    }

}