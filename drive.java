import java.util.*;

public class drive{
    public static void main(String args[]){
        System.out.print("enter ypur age ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.print("you can drive");
        }
        else{
            System.out.print("sorry");
        }
    }
}