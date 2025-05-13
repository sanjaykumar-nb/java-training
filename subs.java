import java.util.ArrayList;
import java.util.HashMap;

public class subs {
    public static void main(String[] args) {
        String input="pwwkew";
        int max=0;
        int left=0;
        String out="";
      
        HashMap<Character,Integer> position= new HashMap<>();
        String[] words = {};

        for (int right=0;right<input.length();right++){
            char current=input.charAt(right);
            if(!position.containsKey(current)){
                position.put(current,right);
                out+=current;
            }
            else{
                left=Math.max(left,position.get(current)+1);
                position.put(current,right);
                
                out="";
            }
            
            max=Math.max(max,right-left+1);
            
              
            
        }
        for (String str : words) {
            if (str.length() == max) {
                System.out.println(str);
                break;
            }
        }
          
        System.out.println(max);
    }
    
}
