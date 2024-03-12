import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum1 = 0;
        int sum2 = 0;
        // Write your code here
        for (int i = 0; i < arr.size(); i++) {
            sum1 += arr.get(i).get(i);
        }

        for (int i = 0; i < arr.size(); i++) {
            sum2 += arr.get(i).get(arr.get(i).size()-(i+1));
        }

        
        return Math.abs(sum1-sum2);

    }
}
