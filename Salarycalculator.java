import java.util.Scanner;
public class Salarycalculator {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    double basic=sc.nextDouble();
    double netsalary=0;
        if(basic>=30000){
            basic=(basic*0.20)+(basic*0.15);
            netsalary=basic-(0.12*basic);
        }
        else {
            basic=(0.08*basic)+(0.10*basic);
            netsalary=basic-(0.12*basic);
        }
        System.out.print("netsalary:"+netsalary);
}
}
