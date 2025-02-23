package one123;

import java.util.HashSet;
import java.util.Set;

public class Consequences {
    public static void main(String[] args){
        int[] num = new int[]{1,4,3,2,4};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        boolean bol = false;
        for(int i : num){
            if(i < min) {
                min = i;
            }
            if(i > max) {
                max = i;
            }
            if(set.contains(i)){
                bol = true;
            } else {
                set.add(i);
            }

        }
        if(max-min+1 != num.length) {
            System.out.println("not consequence");
        } else {
            System.out.println("consequence");
        }
    }
}
