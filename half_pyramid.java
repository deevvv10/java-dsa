import java.util.*;
public class half_pyramid{
    public static void main(String args[]){
        System.out.print("enter number of rows ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
     }
}