import java.util.*;
public class table{
    public static void main(String args[]){
        System.out.print("enter the number for which you have to print the table ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("enter the last term of the table ");
        Scanner b = new Scanner(System.in);
        int n = b.nextInt();
        int z=0;
        for(int i=0;i<n;i++){
            z=z+a;
            System.out.println(z);

        }
    }
}