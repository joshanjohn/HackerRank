import java.util.HashSet;
import java.util.Set;

public class Pangrams {

    public static String pangrams(String s) {
        // Write your code here
        Set<Character> letters = new HashSet<>();
        for (Character letter : s.toLowerCase().toCharArray()) {
            letters.add(letter);
        }
        System.out.println(letters.size());
        return (letters.size() == 27) ? "pangram" : "not pangram";
    }
}
