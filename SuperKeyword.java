public class SuperKeyword {
    public static void main(String[] args) {
        Hours obj = new Hours();
        System.out.println("color = "+ obj.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor called");
    }
}

class Hours extends Animal{
    Hours(){
        super(); // by defualt the constructor set supper
        super.color = "black";
        System.out.println("Hours constructor called");
    }
}
