import java.util.Scanner;
public class Primeno {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        for(int i=num1;i<=num2;i++){
            if(i<2)continue;
            boolean isprime=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime==true){
                System.out.println(i);
            }
        }
        sc.close();
    }    
}
