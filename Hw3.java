import java.util.Scanner;
public class Hw3 {
    public static void main(String[] args) {
                double l,w,area,perimeter;
                Scanner in=new Scanner(System.in);
                System.out.println("enter the length of the rectangle ");
                l=in.nextDouble();
                System.out.println("enter the width of the rectangle ");
                w=in.nextDouble();
                area=l*w;
                perimeter=2*(l+w);
                System.out.println("the area of the rectangle is "+area);
                System.out.println("The perimeter of the rectangle is "+perimeter);

            }
        }
