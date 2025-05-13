import java.util.Scanner;

public class nof1s {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);  
        int a=ip.nextInt(); // Input number
        int count = 0;
        
        while (a != 0) {
            count += a & 1; // Increment count if the last bit is 1
            a >>= 1; // Right shift to check the next bit
        }
        
        System.out.println(count);
    }
    /*
     * int input=10;
     * int mask=1;
     * int counter=0;
     * for(int=0:i<32;i++)
     * {
     * if((input& mask)!=0)   hamming distance---> if((input ^ mask)==1diff)
     * {
     * counter++;
     * }
     * mask=mask<<1;
     * }
     * 
     * System.out.println("number of 1s"+counter);
     */
    
}
