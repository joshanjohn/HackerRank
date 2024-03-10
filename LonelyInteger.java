import java.util.List;

public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        int result = 0;
        for (int num : a) {
            result ^= num; //using xor
        }
        return result;
    }
    
}
