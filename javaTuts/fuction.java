import java.util.Scanner;

public class fuction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);;
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("the sum is "+ Sum(a,b));
    }

    public static int Sum(int a,int b){
        return a+b;
    }
}
