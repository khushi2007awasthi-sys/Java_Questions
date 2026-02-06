import java.util.Scanner;
public class Multiplication {
    Scanner sc=new Scanner(System.in);   
     
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;

        while (b > 0) {
            if ((b & 1) == 1)
                result = result + a;

            a = a << 1;
            b = b >> 1;
        }

        System.out.println(result);
        sc.close();
    }
}
 

