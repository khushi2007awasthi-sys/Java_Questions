import java.util.Scanner;
public class Electricitybill {
    public static void main(String[]args){

    
    Scanner sc=new Scanner(System.in);
    int units=sc.nextInt();
    double bill=0;
    if(units<=100){
        bill=units*2;
    }
    else if(units<200){
        bill=(100*2)+((units-100)*3);
    }
    else {
        bill=200+300+((units-200)*5);
    }
    bill=bill+150;
    System.out.print("bill:"+bill);
    sc.close();
}
}
