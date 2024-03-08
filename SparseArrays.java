import java.util.ArrayList;
import java.util.List;

public class SparseArrays {
    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here

        List result = new ArrayList<>();
        for (String query : queries) {
            int count = 0;
            for (String string : strings) {
                if (string.equals(query)) {
                    count++;
                }
            }
            result.add(count);
        }
        return result;
    }
}
