import java.util.Scanner;

public class Hw8 {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.println("enter number: ");
        a= in.nextInt();
        System.out.println("the square of number is "+ a*a);
        System.out.println("the cube of number is "+ a*a*a);
        System.out.println("the fourth power of number is "+ Math.pow(a,4));
    }
}
