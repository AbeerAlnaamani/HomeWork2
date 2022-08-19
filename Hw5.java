public class Hw5 {
    public static void main(String[] args) {
        int x,y,z;
        x=5;
        y=10;
        System.out.println("x="+x);
        System.out.println("y="+y);
        z=x;
        x=y;
        y=z;
        System.out.println("Variable values after switching: ");
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}
