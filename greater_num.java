import java.util.*;
public class greater_num{
    public static void main(String args[]){
        System.out.print("enter number one ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("enter number two ");
        Scanner sca = new Scanner(System.in);
        int b = sca.nextInt();
        if(a==b){
            System.out.print("both numbers are even ");
        }
        if(a>b){
            System.out.print("number one is greater than number two");
        }
        else{
            System.out.print("number two is greater than number one");
        }
    }
}