import java.util.Scanner;
public class Subtraction {
     
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        b = ~b + 1;

        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }

        System.out.println("Answer = " + a);
        sc.close();
    }
}


