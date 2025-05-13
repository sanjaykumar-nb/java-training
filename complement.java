import java.util.*;
public class complement {

    public static void main(String[] args) {
       
        int ip=10;
        String bin=Integer.toBinaryString(ip);
        String comp="";
        for (int i=0;i<bin.length();i++)
        {
            char ch=bin.charAt(i);
            if(ch=='0')
            {
                comp+='1';
            }
            else{
                comp+='0';
            }
        }
        int compnum=Integer.parseInt(comp,2);
        System.out.println(compnum);

   
    }




    /*
     * int input=10;
     * int complement=~input;
     * int mask=0;
     * while(mask<input)
     * {
     * mask=(mask<<1) |1;
     * }
     * complement=complement & mask;
     * * System.out.println(complement);
     * 
     */


     /*
        * a=a^b;
        * b=a^b;
        * a=a^b;
      */
}
