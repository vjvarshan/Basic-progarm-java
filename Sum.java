// Sum of Digits

import java.util.Scanner;

/*public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;

        for(; a>0; a=a/10){
            int digit = a%10;
            sum = sum + digit;
        }
        System.out.println(sum);
    }
}*/

// Sum of Even Numbers

/*public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;

        for(int i=0; i<=a; i++){
          if(i%2==0){
            sum = sum + i;
          }
        }
        System.out.println(sum);
    }
}*/

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;

       for(int i=0; i<=a; i++){
          if(i%2!=0){
            sum = sum + i;
          }
        }
        System.out.println(sum);
    }
}

