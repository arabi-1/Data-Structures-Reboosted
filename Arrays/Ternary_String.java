import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Using StringTokenizer for safer parsing if lines are messy, 
        // though strictly readLine() is enough for this problem.
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());

        StringBuilder output = new StringBuilder();

        while (t-- > 0) {
            String s = br.readLine();
            output.append(solve(s)).append("\n");
        }
        System.out.print(output);
    }

    private static int solve(String s) {
        int n = s.length();
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        
        // Array to track counts of '1', '2', '3'. 
        // We use size 4 to directly use indices 1, 2, 3.
        int[] count = new int[4];
        int uniqueCount = 0; // To check if we have all 3 characters

        for (int right = 0; right < n; right++) {
            // Convert char '1' to int 1, etc.
            int rightVal = s.charAt(right) - '0';

            // If this is the first time we see this number in current window
            if (count[rightVal] == 0) {
                uniqueCount++;
            }
            count[rightVal]++;

            // While the window is valid (contains 1, 2, and 3)
            while (uniqueCount == 3) {
                // 1. Update our minimum length found so far
                minLen = Math.min(minLen, right - left + 1);

                // 2. Shrink from the left
                int leftVal = s.charAt(left) - '0';
                count[leftVal]--;

                // If count drops to 0, we no longer have that number in window
                if (count[leftVal] == 0) {
                    uniqueCount--;
                }
                left++;
            }
        }

        // If minLen was never touched, it means no valid window exists
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}