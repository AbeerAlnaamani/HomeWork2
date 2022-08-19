import java.util.Scanner;
public class Hw2 {
    public static void main(String[] args) {

                double  a,area,circumference,bi=3.14;
                Scanner in=new Scanner(System.in);
                System.out.println("enter the radius of the circle ");
                a=in.nextDouble();
                area=a*a*bi;
                System.out.println("the area of the circle is "+area);
                circumference=2*a*bi;
                System.out.println("the circumference of the circle is "+circumference);
            }
        }
