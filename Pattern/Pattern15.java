package Pattern;
// Print the pattern 
// A
// BC
// DEF
// GHIJ

public class Pattern15 {
    public static void main(String[] args) {
        
        char alph = 'A';

        for (int i = 0; i <= 4; i++) {
            for (int index = 1; index <= i; index++) {
                System.out.print(alph);
                alph++;
            }
            System.out.println();
        }
    }
}
