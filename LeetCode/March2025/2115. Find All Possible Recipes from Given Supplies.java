// https://leetcode.com/problems/find-all-possible-recipes-from-given-supplies/submissions/1581473503/?envType=daily-question&envId=2025-03-21

import java.util.*;

class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Map<String, List<String>> adj = new HashMap<>();
        Map<String, Integer> indegree = new HashMap<>();
        Set<String> supply = new HashSet<>(Arrays.asList(supplies));

        // Initialize adjacency list and indegree map
        for (int i = 0; i < recipes.length; i++) {
            indegree.put(recipes[i], 0);
            for (String ingredient : ingredients.get(i)) {
                if (!supply.contains(ingredient)) {
                    adj.computeIfAbsent(ingredient, k -> new ArrayList<>()).add(recipes[i]);
                    indegree.put(recipes[i], indegree.getOrDefault(recipes[i], 0) + 1);
                }
            }
        }

        // Initialize queue with recipes that have 0 indegree
        Queue<String> q = new LinkedList<>();
        for (Map.Entry<String, Integer> entry : indegree.entrySet()) {
            if (entry.getValue() == 0) {
                q.offer(entry.getKey());
            }
        }

        // Perform topological sort using Kahn's algorithm
        List<String> res = new ArrayList<>();
        while (!q.isEmpty()) {
            String currRecipe = q.poll();
            res.add(currRecipe);

            if (adj.containsKey(currRecipe)) {
                for (String nextRecipe : adj.get(currRecipe)) {
                    indegree.put(nextRecipe, indegree.get(nextRecipe) - 1);
                    if (indegree.get(nextRecipe) == 0) {
                        q.offer(nextRecipe);
                    }
                }
            }
        }

        return res;
    }
}