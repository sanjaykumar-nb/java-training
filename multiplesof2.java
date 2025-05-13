import java.util.*;

public class multiplesof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*if((n & (n-1)) == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }*/


        System.out.println(~(n+1));
        sc.close();
    }
    
}
