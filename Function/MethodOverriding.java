package Function;
public class MethodOverriding {
    public static void main(String[] args) {
        cow an = new cow();
        an.eat();
        an.move();
    }
}
class animal{
    void eat(){
        System.out.println("lion eats non veg");
    }
    void move(){
        System.out.println("lion moving to target");
    }
}

class cow extends animal{
    void eat(){
        System.out.println("cow eats veg");
    }
    void move(){
        System.out.println("cow moving to target");
    }
}