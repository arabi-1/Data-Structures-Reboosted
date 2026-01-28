import java.util.HashMap;
import java.util.Map;

class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        // Array of Maps to store color counts for each player
        // counts[i] maps ColorID -> Frequency for player i
        Map<Integer, Integer>[] counts = new HashMap[n];
        
        // Initialize the maps
        for (int i = 0; i < n; i++) {
            counts[i] = new HashMap<>();
        }

        // Track which players have already won to avoid double counting
        boolean[] hasWon = new boolean[n];
        int totalWinners = 0;

        for (int[] p : pick) {
            int player = p[0];
            int color = p[1];

            // Update the count for this specific color for this player
            counts[player].put(color, counts[player].getOrDefault(color, 0) + 1);

            // Check winning condition: 
            // Player i wins if they pick strictly more than i balls of the same color
            if (!hasWon[player] && counts[player].get(color) > player) {
                hasWon[player] = true;
                totalWinners++;
            }
        }

        return totalWinners;
    }
}