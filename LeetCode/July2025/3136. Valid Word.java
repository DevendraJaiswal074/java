// https://leetcode.com/problems/valid-word/?envType=daily-question&envId=2025-07-15

class Solution {
    public boolean isValid(String word) {
        if(word == null || word.length()<3){
            return false;
        }

        boolean vowel = false;
        boolean cons = false;
        for(char alph : word.toCharArray()){
            if(!Character.isLetterOrDigit(alph)){
                return false;
            }

            if (Character.isLetter(alph)) {
                char lower = Character.toLowerCase(alph);
                if ("aeiou".indexOf(lower) >= 0) {
                    vowel = true;
                } else {
                    cons = true;
                }
            }
        }
        return vowel && cons;
    }
}