import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(sc);
        System.out.print("enter the number = ");
        int n = sc.nextInt(), temp,sum=0,r;
        temp=n;
        while(n>0){
            r=n%10;
            sum = sum +(r*r*r*r);
            n=n/10;
        }
        if(temp==sum) System.out.println("entered number is armstrong");
        else System.out.println("entered number is not armstrong ");
    }
}
