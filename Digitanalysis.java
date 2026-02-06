import java.util.Scanner;
public class Digitanalysis {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ori=num;
        int reverse=0;
        int sum=0;
        int count=0;
        while(ori!=0){
            int ld=ori%10;
            reverse=reverse*10+ld;
            sum=sum+ld;
            count++;
            ori=ori/10;
        }
        System.out.println("reverse:"+reverse);
        System.out.println("sum:"+sum);
        System.out.println("count:"+count);
    }    
}
