import java.util.*;

public class reversed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        int digit = sc.nextInt(),reversed = 0,number;
        while(digit!=0){
        number=digit%10;
        reversed=reversed*10+number;
        digit=digit/10;
        }
        System.out.println(reversed);
    }
}
