// Armstrong Number Three digits

import java.util.Scanner;

/*public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        int armstrong = 0;
        
        for(;a>=0;a=a/10){
            int b = a%10;
            int arm = b * b * b;
            armstrong = armstrong + arm;
        }
            if(temp == armstrong) {
    	  System.out.println("Armstrong Number");
        }
        else {
        	System.out.println("Not Armstrong Number");
        }
    }
}*/

// Armstrong Number Four digits

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int temp = a;
        int armstrong = 0;
        
        for(;a>=0;a=a/10){
            int b = a%10;
            int arm = b * b * b *b;
            armstrong = armstrong + arm;
        }
            if(temp == armstrong) {
    	  System.out.println("Armstrong Number");
        }
        else {
        	System.out.println("Not Armstrong Number");
        }
    }
}