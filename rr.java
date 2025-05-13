import java.util.Scanner;

public class rr {
    public static int reverseBits(int result) {
        
        int result1=0;
        for(int i=0;i<32;i++){
            int r=result & 1;
;
        

            if(result1!=0)
            {
                result1 =result1 << 1;
            }
            
            if(r==1)
            {
                result1 =result1 | 1;
            }
            
            result=result >> 1;
        }
        return result1; 
    }

    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int reversed = reverseBits(num);
            System.out.println("Reversed Bits: " + reversed);
            sc.close();
        }
    }
