// create the stringbuilder and perform all opration

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("leak");

        System.out.println("Before opration var store the string"+name);

        // Replace char
        name.setCharAt(0, 'p');
        System.out.println(name);

        // Insert
        name.insert(4, 'e');
        name.insert(5, 'r');
        System.out.println(name);

        // Deletion 
        name.delete(4,6);
        System.out.println(name);

        //Append char
        name.append('e');
        name.append('r');
        System.out.println(name);

    }
}
