import java.util.*;
 class operations {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        operations op=new operations();

        int[] ar=new int[10];
        for(int i=0;i<10;i++)
        {
            ar[i]=ip.nextInt();
        }


        System.out.println("value");
        int ex=ip.nextInt();
        int[] arr=op.ad(ar,10,ex);

    }
    public int[] ad(int[] arr,int size,int val){
        int[] newar=new int[1+size];
        System.out.println("index:");

        System.out.println("value:");
        System.arraycopy(arr,0,newar,0,newar.length);
    }

    
}
