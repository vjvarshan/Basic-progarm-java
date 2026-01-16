//count numbers
import java.util.Scanner;

/*public class count {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;

        for(int i=1;i<=a;i++){
            count++;
        }
        System.out.println(count);
    }
}*/

// count even numbers only

/*public class count {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;

        for(int i=1;i<=a;i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}*/

// count odd numbers only

public class count {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;

        for(int i=1;i<=a;i++){
            if(i%2!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}