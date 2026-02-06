import java.util.Scanner;
public class Pattern {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            int d=1;
            for(int j=1;j<=i;j++){
                System.out.print(d);
                d++;
            }
            System.out.print("\n");
        }
        sc.close();
    }    
}
