import java.util.Scanner;
public class Smartbilling {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    double bill=sc.nextDouble();
    double newbill=0;
     
     if(bill>=5000){
        bill=bill-(10*bill)/100;
        newbill=bill+(18*bill)/100;
    }
    else if(bill>=2000){
        bill=bill-(5*bill)/100;
        newbill=bill+(18*bill)/100;
    }
    else 
        newbill=bill+(18*bill)/100;
    sc.close();
    System.out.print(newbill);
}
}
