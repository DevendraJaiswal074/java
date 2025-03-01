package Practice;
// Base interface A
interface A {
    void methodA();
}

// Interface B extends A (Multilevel Inheritance)
interface B extends A {
    void methodB();
}

// Interface C extends A (Multiple Inheritance)
interface C extends A {
    void methodC();
}

// Class D implements both B and C (Hybrid Inheritance)
class D implements B, C {
    public void methodA() {
        System.out.println("Method A from interface A");
    }
    public void methodB() {
        System.out.println("Method B from interface B");
    }
    public void methodC() {
        System.out.println("Method C from interface C");
    }
}

public class Hybrid_Inheritance {
    public static void main(String[] args) {
        D obj = new D();
        obj.methodA(); // From A
        obj.methodB(); // From B
        obj.methodC(); // From C
    }
}
