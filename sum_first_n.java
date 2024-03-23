import java.util.*;
public class sum_first_n{
    public static void main(String args[]){
        System.out.print("enter last term ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int s = 0;
        for(int i =0;i<=a;i++){
            s=s+i;
        }
        System.out.print(s);
    }
}