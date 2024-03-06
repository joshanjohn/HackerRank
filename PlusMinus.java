import java.util.List;

class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        double totalCount = arr.size();

        double positiveCount = 0; // number of possitive numbers
        double negativeCount = 0; // number of negative numbers
        double zeroCount = 0; // number of zeros

        for (int num : arr) {
            positiveCount += (num > 0) ? 1 : 0;
            negativeCount += (num < 0) ? 1 : 0;
            zeroCount += (num == 0) ? 1 : 0;
        }

        // calcualting the propotions
        double positiveRatio = (positiveCount / totalCount); // ratio of positive
        double negativeRatio = negativeCount / totalCount; // ratio of negative
        double zeroRatio = (zeroCount / totalCount);

        // printing the ratios
        System.out.println(String.format("%.6f", positiveRatio));
        System.out.println(String.format("%.6f", negativeRatio));
        System.out.println(String.format("%.6f", zeroRatio));
    }
}