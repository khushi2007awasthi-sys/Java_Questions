import java.util.Scanner;
public class LoginAuthentication {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String username="mujhe nhi pta";
        int password=2007;
        boolean success=false;
        int tries=0;
        while(tries<3){
        String u=sc.nextLine();
        int p=sc.nextInt();
        if(u.equals(username)&& p==password){
            System.out.print("login successful");
            success=true;
            break;
        }
        else{
            System.out.print("invalid");
            tries++;
        }
        }
        if(success==false){
            System.out.print("account locked after 3 tries");
        }
        sc.close();
    }
}
