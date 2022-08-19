import java.util.Scanner;

public class Hw9 {
    public static void main(String[] args) {
        double a,b;
        Scanner in =new Scanner(System.in);
        System.out.println("enter the first number ");
        a=in.nextDouble();
        System.out.println("enter the second number ");
        b=in.nextDouble();
        System.out.println("the sum is "+ (a+b));
        System.out.println("the difference is "+ (a-b));
        System.out.println(" the product is "+ (a*b));
        System.out.println("the average is "+ ((a+b)/2));
        if ((a-b)>0){System.out.println("the distance is "+ (a-b));}
        else System.out.println("the distance is "+ (-1*(a-b)));
        System.out.println("the maximum is "+ Math.max(a,b));
        System.out.println(" the minimum is "+ Math.min(a,b));
    }

}
