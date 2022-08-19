import java.util.Scanner;
public class Hw10 {
    public static void main(String[] args) {
        int a =20, b=25;
        System.out.println("the sum is " + (a + b));
        System.out.println("the difference is " + (a - b));
        System.out.println(" the product is " + (a * b));
        System.out.println("the average is " +((a+b)/2.0) );
        if ((a-b)>0){System.out.println("the distance is "+ (a-b));}
        else System.out.println("the distance is "+ (-1*(a-b)));
        System.out.println("the maximum is " + Math.max(a, b));
        System.out.println("the minimum is " + Math.min(a, b));
    }
}
