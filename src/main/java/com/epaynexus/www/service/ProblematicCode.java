public class ProblematicCode {

    private int unusedVariable = 42;

    public static void main(String[] args) {
        // This is a deliberate comment missing
        System.out.println("Hello, World!");

        // Code duplication
        int x = 10;
        int y = 20;
        int result1 = x + y;

        int a = 5;
        int b = 15;
        int result2 = a + b;

        // Unused variable
        System.out.println(result2);
    }

    // Unused method
    private void unusedMethod() {
        System.out.println("This method is not used.");

    }
}
