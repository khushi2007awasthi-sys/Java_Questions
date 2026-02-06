import java.util.Scanner;
public class Atmwithdrawal {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double balance=sc.nextDouble();
        double withdrawal=sc.nextDouble();
        if(withdrawal%100==0&&(balance-withdrawal)>=1000){
            System.out.print("withdrawal successfull");
        }
        else System.out.print("failure in withdrawal");
    }
}
