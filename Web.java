package hackerrank;
/*A variable is a location in memory (storage area) to hold data. To indicate the storage area, each variable should be given a unique name (identifier).

How to declare variables in Java? Here's an example to declare a variable in Java.

 int speedLimit = 80;
Here, speedLimit is a variable of int data type and is assigned value 80. Meaning, the speedLimit variable can store integer values.

Java is a statically-typed language. This means that all variables must be declared before they can be used.

 int speed;
Here, speed is a variable, and the data type of the variable is int. The int data type determines that the speed variable can only contain integers.

In simple terms, a variable's data type determines the values a variable can store. There are several data types predefined in Java programming language, known as primitive data types.

Some of the common data types you need to know:

int
String
char
boolean
Try the following example in the editor below.

You have to assign the following values in the variable:

"InterviewBit" should be assigned in the variable named mystring1.
"Don't change the variable name" should be assigned in the variable named mystring2.
11 should be assigned in the variable named myint.
true should be assigned in the variable named myboolean. */


public class Web {
    public static void main(String[] args) {
        /*
        Assign values to the following variable as described above
        Don't change the variable name
        */
        String mystring1;
        mystring1 = "InterviewBit";
        String mystring2;
        mystring2 ="Don't change the variable name";
        int myint;
        myint =11;
        boolean myboolean;
        myboolean = true;
        
        
        /*Don't change the code below*/
        System.out.println("String1 = " + mystring1);
        System.out.println("String2 = " + mystring2);
        System.out.println("int = " + myint);
        System.out.println("boolean = " + myboolean);

        
    }
}