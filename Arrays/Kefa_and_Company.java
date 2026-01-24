import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Kefa_and_Company {

    // In Java 21, we can use 'record' to create a clean, immutable data structure.
    // It automatically generates the constructor, getters, equals, and hashcode.
    record Friend(int money, int friendship) implements Comparable<Friend> {
        @Override
        public int compareTo(Friend other) {
            // Sort by money in ascending order
            return Integer.compare(this.money, other.money);
        }
    }

    public static void main(String[] args) throws IOException {
        // Fast I/O setup
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        Friend[] friends = new Friend[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            friends[i] = new Friend(m, s);
        }

        // Step 1: Sort the friends based on their money
        // Time Complexity: O(n log n)
        Arrays.sort(friends);

        // Step 2: Sliding Window
        // Time Complexity: O(n)
        int left = 0;
        long currentFriendship = 0; // 'long' prevents overflow for large friendship values
        long maxFriendship = 0;

        for (int right = 0; right < n; right++) {
            // Expand the window by adding the current friend's friendship factor
            currentFriendship += friends[right].friendship();

            // Shrink the window if the money difference violates the condition (< d)
            while (friends[right].money() - friends[left].money() >= d) {
                currentFriendship -= friends[left].friendship();
                left++;
            }

            // Track the maximum friendship factor found
            maxFriendship = Math.max(maxFriendship, currentFriendship);
        }

        System.out.println(maxFriendship);
    }
}