package String;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/?envType=problem-list-v2&envId=string

class Solution {
    public int strStr(String haystack, String needle) {

        if(haystack.length()<needle.length()){
            return -1;
        }
        
        for (int i = 0; i <= haystack.length() - needle.length(); i++){
            for(int j = 0 ; j<needle.length(); j++){
                
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
                if(j==needle.length()-1){
                    return i;
                }
            }
        }
        return -1;
    }
}

//Approach 2

// class Solution {
//     public int strStr(String haystack, String needle) {
        

//         if(haystack.contains(needle))
//         {
//             return haystack.indexOf(needle);
//         }
//         else{
//             return -1;
//         }

//     }
// }