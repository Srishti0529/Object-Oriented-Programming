package Exception_Handeling;

public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int result = a / b; // risky code
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");

        } finally {
            System.out.println("Execution completed");
        }

        System.out.println("Program continues...");
    }
}