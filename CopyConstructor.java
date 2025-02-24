public class CopyConstructor {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.roll = 1;
        obj1.name = "dev";
        obj1.marks[0] = 33;
        obj1.marks[1] = 23;
        obj1.marks[2] = 55;

        Student obj2 = new Student(obj1); // Copy Constructor
        
        obj1.marks[0] = 40;
        for (int i = 0; i < 3; i++) {
            System.out.println( obj2.marks[i]);
        }
    }
}

class Student {
    int roll;
    String name;
    int marks[];

    Student(Student obj1) {
        this.roll = obj1.roll;
        this.name = obj1.name;

        // Deep copy: create a new marks array
        this.marks = new int[3];
        for (int i = 0; i < 3; i++) {
            this.marks[i] = obj1.marks[i];
        }
    }

    Student() {
        System.out.println("hello");
        this.marks = new int[3]; // Initialize marks array to avoid NullPointerException
    }

    Student(int roll) {
        this.roll = roll;
        this.marks = new int[3];
    }

    Student(String name) {
        this.name = name;
        this.marks = new int[3];
    }

    Student(int marks[]) {
        this.marks = marks;
    }
}