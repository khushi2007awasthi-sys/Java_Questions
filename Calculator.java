import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first no");
        int no1=sc.nextInt();
        System.out.print("enter second no");
        int no2=sc.nextInt();
        System.out.println("choose the follwoing options");
        System.out.println("1:add");
        System.out.println("2:sub");
        System.out.println("3:mul");
        System.out.println("4:div");
        System.out.println("5:modulo");
        int choice=sc.nextInt();
        switch(choice){
            case 1: System.out.print(no1+no2);
            break;
            case 2: System.out.print(no1-no2);
            break;
            case 3: System.out.print(no1*no2);
            break;
            case 4: System.out.print((float)no1/no2);
            break;
            case 5: System.out.print(no1%no2);
            break;
            default: System.out.print("choose from the following choices");
            
        }
        sc.close();
}
}
