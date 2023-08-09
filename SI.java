import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(sc);
    int p = sc.nextInt();
    int r = sc.nextInt();
    int t = sc.nextInt();
    int SI = (p*r*t)/100;
    System.out.println("Simple Interest is "+SI);
    }
}
