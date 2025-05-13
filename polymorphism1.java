public class polymorphism1 {
    public static void main(String[] args) {
        int n1=5;
        int n2=5;
        System.out.println(calculate(n1, n2));
        System.out.println(calculate(n1));


    
    }
    public static int calculate(int a, int b) {
        return a+b;
    }
    public static int calculate(int a) {
        return a*a;
    }
}
/*
 * polymorphism overloading
 * no. of inputs
 * type of inputs
 * type of return value
 */