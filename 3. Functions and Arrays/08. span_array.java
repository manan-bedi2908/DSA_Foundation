import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] one = new int[n];
        
        for(int i = 0; i < one.length; i++) {
            one[i] = scn.nextInt();
        }
        
        int max = one[0];
        int min = one[0];
        for(int i = 1; i < one.length; i++) {
            if (one[i] > max) {
                max = one[i];
            }
            if(one[i] < min) {
                min = one[i];
            }
        }
        
        int span = max - min;
        System.out.println(span);
    }
}