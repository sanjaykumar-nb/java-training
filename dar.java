public class dar {
public static void main(String[] args) {
    int[][] arr={{3,0,0,0,0},{0,3,0,5,0},{0,0,1,0,0},{0,0,0,4,0},{0,0,0,0,5}};
    boolean a=dar.check(arr);
    System.out.println(a);
    

    
}
public static boolean check(int[][] arr){
    for(int i=0;i<arr.length;i++)
{
    for(int j=0;j<arr.length;j++){
        if(i!=j && arr[i][j]!=0){
            return false;

        }
    }
}
return true;

}
public static boolean upper(int[][] arr){
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr.length;j++){
            if(i>j && arr[i][j]!=0){
                return false;
            }
        }

    }
    return true;
}




public static boolean lower(int[][] arr){
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr.length;j++){
            if(i<j && arr[i][j]!=0){
                return false;
            }
        }

    }
    return true;
}
public static boolean symmetric(int[][] arr){
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;i<arr.length;j++){
            if(arr[i][j]!=arr[j][i]){
                return false;
            }
        }

    }
    return true;
}
public static boolean toeplitz
}
