public class binarysearch {

    
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10,10,10,10,10,10,10, 40,50,77,80,96};
        int x = 10;

       
        int result = binarysearch(arr, x);

        if (result == -1)
            System.out.println("Element not present in array");
        else
            System.out.println("Element found at index " + result);

        int result1 = firstindex(arr, x);
        System.out.println(result1);

    }




   

        public static int binarysearch(int arr[],int x) {
            int l=0;
            int r=arr.length-1;
            while (l <= r) {
                int mid = l+r/2;
                if (arr[mid] == x)
                    return mid;
                if (arr[mid] > x)
                    r=mid-1;
                else
                    l=mid+1;
            }
            return -1;
        }
    
        public static int firstindex(int arr[],int x) {
            int l=0;
            int r=arr.length-1;
            int result=-1;
            int mid=0;
            while (l < r) {
                mid = l+r/2;
                if (arr[mid] == x )
                    r=mid-1;
                    result=mid;
                if (arr[mid] > x)
                    r=mid-1;
                else
                    l=mid+1;
            }
            return mid;
        }
    }


