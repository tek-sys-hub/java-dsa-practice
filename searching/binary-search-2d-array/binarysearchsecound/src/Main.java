import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                {10,20,30,40},
                {11,25,35,45},
                {28,29,37,45},
                {33,34,38,50}
        };

        int target = 45;

        System.out.println(Arrays.toString(search(matrix , target)));

    }

    public static int[] search (int[][] matrix , int target) {

        int rowStart = 0;
        int colStart = matrix.length - 1;

        while (rowStart < matrix.length && colStart >= 0) {

            if (matrix[rowStart][colStart] == target) {
                return new int[] {rowStart , colStart};
            }
            if (matrix[rowStart][colStart] < target) {
                rowStart ++;
            }else {
                colStart --;
            }

        }

        return new int[]{-1 , -1};
    }

}