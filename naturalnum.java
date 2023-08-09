import java.util.Scanner;

public class naturalnum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter the  number = ");
       int n = sc.nextInt();
       int num=1;
       while(num<=n){
        System.out.println(num);
        num=num+1;
       }
    }
}
