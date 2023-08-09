import java.util.Scanner;

public class pallendrom {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(sc);
    System.out.print("Enter the number= ");
    int n = sc.nextInt(),reversed=0,num,temp;
    temp=n;
    while(n>0){
        num=n%10;
        reversed=reversed*10+num;
        n=n/10;
    }
    if(temp==reversed) System.out.println("this number is pallendrom ");
    else System.out.println("this is not pallendrom ");
    }
}
        
