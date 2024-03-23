import java.util.*;

class userinput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //nextInt
        //nextFloat
        System.out.println(name);
        int a = sc.nextInt();
        int b = a*a;
        System.out.println(b);

    }
}