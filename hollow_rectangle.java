import java.util.*;
public class hollow_rectangle{
    public static void main(String args[]){
        System.out.print("enter number of rows ");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("enter number of columns ");
        Scanner sca = new Scanner(System.in);
        int b=sca.nextInt();
        int a=4;
        int b=5;
        for(int i =0;i<a;i++){
            for(int j=0;j<b;j++){
                if(i==1 || j==1 || i==a || j==b){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }

    }
}