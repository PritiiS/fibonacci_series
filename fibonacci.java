package practices;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range of the fibonacci series :");
        int range=sc.nextInt();
        System.out.println("the series is :");
        fibonacci(range);
    }
    static void fibonacci(int x){
        int num1=0;
        int num2=1;
        int res=0;
        for (int i=1;i<=x-1;i++){
            System.out.print(num1+",");
            res=num1+num2;
            num1=num2;
            num2=res;
        }
    }
}
