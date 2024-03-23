import java.util.*;

public class odd_or_even{
    public static void main(String args[]){
        System.out.print("enter your number ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("the given number is even");
        }
        else{
            System.out.println("the given number is odd");
        }
    }
}