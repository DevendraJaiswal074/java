import java.util.*;

class Solution {
    public int maxCandies(int[] status, int[] candies,
                          int[][] keys, int[][] containedBoxes,
                          int[] initialBoxes) {
        
        int candiesCollected = 0;
        Set<Integer> visited = new HashSet<>();
        Set<Integer> foundBoxes = new HashSet<>();
        Queue<Integer> que = new LinkedList<>();

        for (int box : initialBoxes) {
            foundBoxes.add(box);
            if (status[box] == 1) {
                que.offer(box);
                visited.add(box);
                candiesCollected += candies[box];
            }
        }

        while (!que.isEmpty()) {
            int box = que.poll();

            // Process contained boxes
            for (int innerBox : containedBoxes[box]) {
                foundBoxes.add(innerBox);
                if (status[innerBox] == 1 && !visited.contains(innerBox)) {
                    que.offer(innerBox);
                    visited.add(innerBox);
                    candiesCollected += candies[innerBox];
                }
            }

            // Process keys
            for (int boxKey : keys[box]) {
                status[boxKey] = 1; // mark as openable
                if (foundBoxes.contains(boxKey) && !visited.contains(boxKey)) {
                    que.offer(boxKey);
                    visited.add(boxKey);
                    candiesCollected += candies[boxKey];
                }
            }
        }

        return candiesCollected;
    }
}