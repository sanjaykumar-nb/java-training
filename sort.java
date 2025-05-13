import java.util.*;
public class sort {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        /*
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(10);
        ar.add(20);
        ar.add(40);
        System.out.println("Enter the value to be added:");
        int ex = ip.nextInt();
        ar.add(ex);
        Collections.sort(ar, null);
        System.out.println(ar);
        */
        int[] arr = {3, 5, 7, 24, 63};
        System.out.println("Enter the value to be added:");
        int ex = ip.nextInt();
        int[] newar = new int[arr.length + 1];
        System.arraycopy(arr, 0, newar, 0, arr.length);
        newar[arr.length] = ex;
        Arrays.sort(newar);
        System.out.println("Sorted array: " + Arrays.toString(newar));
        ip.close();
    
    }
    
}
