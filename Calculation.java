package calculation;
        
import java.util.Scanner;

public class Calculation {

   
    public static void main(String[] args) {
       float a,b;
        System.out.println("Enter number 1:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        System.out.println("Enter number 2:");
        b=sc.nextFloat();
        System.out.println(a+"+"+b+"="+(a+b));
    System.out.println(a+"-"+b+"="+(a-b));
    System.out.println(a+"*"+b+"="+(a*b));
    System.out.println(a+"/"+b+"="+(a/b));
    }
}