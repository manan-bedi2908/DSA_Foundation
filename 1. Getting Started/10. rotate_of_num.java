import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int div = 1;
        int mult = 1;
        int temp = n;
        int nod = 0;
        int rot = 0;
        while(temp != 0) {
            nod++;
            temp /= 10;
        }
        k = k % nod;
        if (k < 0) {
            k += nod;
        }
        for (int i = 0; i < nod; i++) {
            if(i < k) {
                div *= 10;
            } else {
                mult *= 10;
            }
            int q = n / div;
            int r = n % div;
            rot = r * mult + q;
        }
        System.out.println(rot);
    }
}