import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays {
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here

        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());

        for (int i = 0; i < A.size(); i++) {
            if ((Integer) (A.get(i) + B.get(i)) < k) {
                return "NO";
            }
        }

        return "YES";
    }

}
