import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(multiples(20));
        int[] test = {1,2,3,1};     
        System.out.println(repeatArray(test));
    }
    private static int multiples(int n) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            if(i % 5 == 0 || i % 7 == 0) {
                sum+=i;
            }
        }
        return sum;
    }
    private static boolean repeatArray(int[] array) {
        Set<Integer> set = new HashSet<Integer>(); 
        for(int i = 0; i<array.length; i++) {
            if(!set.contains(array[i])) {
                set.add(array[i]);
            }
            else {
                return true;
            }
        }
        return false;
    }
}



