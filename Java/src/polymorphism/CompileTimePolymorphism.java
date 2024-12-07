package polymorphism;
class Overload {
    // Method with no parameters
    void display() {
        System.out.println("Display with no parameters");
    }
    // Method with one integer parameter
    void display(int a) {
        System.out.println("Display with one integer parameter: " + a);
    }
    // Method with two integer parameters
    void display(int a, int b) {
        System.out.println("Display with two integer parameters: " + a + ", " + b);
    }
    // Method with one string parameter
    void display(String s) {
        System.out.println("Display with one string parameter: " + s);
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Overload obj = new Overload();

        // Calling the method with no parameters
        obj.display();

        // Calling the method with one integer parameter
        obj.display(10);

        // Calling the method with two integer parameters
        obj.display(10, 20);

        // Calling the method with one string parameter
        obj.display("Hello");
    }
}

