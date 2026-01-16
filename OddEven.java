
import java.util.Scanner;

/*public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();

        if(a%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
   }
}*/

//print only even numbers

/*public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();

        for(int i=1;i<=a;i++){
           if(i%2==0){
                System.out.println(i);
          } 
        }
       
   }
}*/

//print only odd numbers

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();

        for(int i=1;i<=a;i++){
           if(i%2!=0){
                System.out.println(i);
          } 
        }
       
   }
}