import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println(sc);
        System.out.print("enter the number = ");
        int n = sc.nextInt(),fac=1;
        for(int i =1 ; i<=n ; i++){
            fac=i*fac;
        }
        System.out.println(fac);
    }
}
        
        
        
        
            

    

