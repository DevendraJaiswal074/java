//https://www.geeksforgeeks.org/problems/display-longest-name0853/1?page=1&category=Strings&sortBy=difficulty

class Solution {
    public String longest(List<String> names) {

        String longest = names.get(0);

        for (int i = 1; i < names.size(); i++) {
            if (names.get(i).length() > longest.length()) {
                longest = names.get(i);
            }
        }

        return longest;
    }
}
