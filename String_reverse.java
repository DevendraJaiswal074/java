//print the string in reverse order if string store 'Dev' the print it reverse 'ved'

public class String_reverse {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("hello dev");

        for (int i = 0; i < name.length()/2; i++) {
            int start =i;
            int end = name.length()-1-i; //3-1-0

            char forward= name.charAt(start);
            char backward = name.charAt(end);
            
            name.setCharAt(start, backward);
            name.setCharAt(end, forward);
        }
        System.out.println(name);
    }
}
