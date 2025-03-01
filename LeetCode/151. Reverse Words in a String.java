//https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public String reverseWords(String s) {        
        String[] wordsArray = s.trim().split("\\s+");   
        List<String> wordsList = new ArrayList<String>(Arrays.asList(wordsArray));
      
        Collections.reverse(wordsList);
      
        String reversed = String.join(" ", wordsList);
      
        return reversed;
    }
}