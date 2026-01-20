
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rev = 0;
        
        for(;a!=0;a=a/10){
            int digit = a%10;
            rev = rev * 10 + digit;
        }
        System.out.println(rev);
    }
}
