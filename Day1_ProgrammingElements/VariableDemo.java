public class VariableDemo {

    int instanceVar = 10;

    static int staticVar = 20;

    void showVariables() {
        int localVar = 5;

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        // Creating two objects of VariableDemo class
        VariableDemo obj1 = new VariableDemo();
        VariableDemo obj2 = new VariableDemo();

        System.out.println("=== Using obj1 ===");
        obj1.showVariables();

        obj2.instanceVar = 99;

        VariableDemo.staticVar = 50;

        System.out.println("\n=== Using obj2 ===");
        obj2.showVariables();

        System.out.println("\n=== Using obj1 Again ===");
        obj1.showVariables(); 
    }
}
