import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        double num1, num2, num3, num4;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number");
        num1= in.nextDouble();
        System.out.println("enter the second number");
        num2= in.nextDouble();
        System.out.println("enter the third number");
        num3= in.nextDouble();
        num4= (num1+num2+num3)/3;
        System.out.print("The average of the three numbers is ");
        System.out.println(num4);
    }
}
