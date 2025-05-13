import java.util.Scanner;

public class except {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int num = scanner.nextInt(); 

            int divisor = scanner.nextInt();  

            int result = num / divisor;  
            System.out.println("Result: " + result);
        
        }
        
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
        
        catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        } 
        
        finally {
            scanner.close();  // Ensures resource cleanup
            System.out.println("Execution completed.");
        }
    }
}
z