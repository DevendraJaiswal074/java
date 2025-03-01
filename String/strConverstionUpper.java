package String;
public class strConverstionUpper {

    public static String convert(String str){
            StringBuilder str2 = new StringBuilder(" ");
    
            char ch = Character.toUpperCase(str.charAt(0));
            str2.append(ch);
    
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == ' ' && i < str.length()-1) {
                    str2.append(str.charAt(i));
                    i++;
                    str2.append(Character.toUpperCase(str.charAt(i)));
                }
                else{
                    str2.append(str.charAt(i));
                }
            }
            return str2.toString();
        }
        public static void main(String[] arg){
            String str = "hello world";
            System.out.println(convert(str));
    }
}
