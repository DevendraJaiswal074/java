package String;

// https://www.geeksforgeeks.org/problems/sandwiched-vowels5158/1?page=1&category=Strings&sortBy=difficulty

class Complete {

    public static String Sandwiched_Vowel(String str) {

        int n = str.length();
        if (n <= 2) return str; // cannot be sandwiched

        StringBuilder result = new StringBuilder();

        // first character always included
        result.append(str.charAt(0));

        for (int i = 1; i < n - 1; i++) {
            char curr = str.charAt(i);

            if (isVowel(curr) &&
                !isVowel(str.charAt(i - 1)) &&
                !isVowel(str.charAt(i + 1))) {
                // skip sandwiched vowel
                continue;
            }

            result.append(curr);
        }

        // last character always included
        result.append(str.charAt(n - 1));

        return result.toString();
    }

    // helper function
    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}