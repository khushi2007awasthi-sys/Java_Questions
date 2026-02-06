import java.util.Scanner;
public class Noclassification {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    if(num>=0){
        System.out.println("positive");
    }
    else System.out.println("negative");
    if(num%2==0){
        System.out.println("even no");
    }
    else System.out.println("odd no");

    if(num%5==0&&num%7==0){
        System.out.println("divisible by both 5 and 7");
    }
    else System.out.println("not divisible by 7 and 5");
    sc.close();
    }

}