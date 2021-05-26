import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int digits = 0;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        int div = (int)Math.pow(10, digits-1);
        while(div != 0) {
            int digit = n / div;
            System.out.println(digit);
            n = n % div;
            div /= 10;
        }
    }
}