// print the all possible outcome 'ABC' using BACKTRACKING



public class tracking{

    public static void printpermutation(String str, String newStr ,int index) {
        if (str.length()== 0){
            System.out.println(newStr);
            return ;
        }

        for (int i = 0; i < str.length(); i++) {
            char current_value = str.charAt(i);
            String newstr2 = str.substring(0,i)+str.substring(i+1);
            printpermutation(newstr2, current_value+newStr, index+1);
        }
    }

    public static void main(String[] args) {
        String str = "ABC" ;
        printpermutation(str,"",0);
    }
    
}