import  java.util.*;

public class setops {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Set.of(1,3,9,7,4));
        set1.addAll(set2);
        System.out.println("Union: " + set1);

        set1.retainAll(set2);
        System.out.println("Intersections  "+set1);
        
    }
    
}
