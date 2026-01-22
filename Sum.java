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

// Sum of Odd Numbers

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
// Sum of Prime Numbers
public class Sum {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println("Sum of Prime Numbers  :");
    int sum = 0;
    for(int i=1;i<=a;i++){
        int count = 0;

        for(int j=1;j<=i;j++){
        if(i%j==0) {
            count++;
        }
      } 
      if(count == 2){
        sum = sum + i;
      }
    }
     System.out.println(sum);
 }

}

