public class StrCompare {

    public static void main(String[] arg){
        String str[] = {"mango" , "apple", "banana"};

        String str1 = str[0];

        for (int i = 1; i < str.length; i++) {
            if (str1.compareTo(str[i]) < 0) {
                str1 = str[i];
            }
        }

        System.out.println("largest string are ="+str1);
    }
}
