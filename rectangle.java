import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println(sc);
       System.out.println(" enter the breath of rectangle = ");
       int b = sc.nextInt();
       System.out.println("enter the length of the rectangl = ");
       int l = sc.nextInt();
       int area= l*b;
       System.out.println("Area of the rectangle = "+area+" cm");
    }
}
