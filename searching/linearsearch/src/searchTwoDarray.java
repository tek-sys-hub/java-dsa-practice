import java.lang.reflect.Array;
import java.util.Arrays;

public class searchTwoDarray {
    public static void main(String[] args) {
        int[][] arr = {
                {1 ,2 ,3},
                {4, 5, 6},
                {55,12,63,65,69},
                {15,85,96,78,11,32}
        };
        int target = 96;
       int[] ans = check(arr, target);
        System.out.println(Arrays.toString(ans));
}

    static int[] check (int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[]{0 ,0};
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]){
                    return new int[]{i ,j};
                }
            }
        }

        return new int[]{-1 ,-1 };
    }
}
