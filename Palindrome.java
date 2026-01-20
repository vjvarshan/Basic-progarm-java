import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        int pal = 0;

        for(;a!=0;a=a/10){
            int digit = a%10;
            pal = pal*10 + digit;
        }
        if(temp==pal){
            System.out.println("It is Palindrome Number");
        }
        else {
            System.out.println("It is not Palindrome Number");
        }
    }
}
