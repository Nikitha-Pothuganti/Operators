import java.util.*;
public class Operators {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);{
       //Arthematic operators:-
       System.out.println("Arthematic operators:-");
        System.out.println("Enter 1st value: ");
        int a=sc.nextInt();
        System.out.println("Enter 2nd value: ");
        int b=sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(b/a);
        System.out.println(a%b);
        System.out.println("Relational operators:-");
        System.out.println("Enter any two values: ");
        int num1 =sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(num1>num2);
        System.out.println(num1<num2);
        System.out.println(num1>=num2);
        System.out.println(num1<=num2);
        System.out.println(num1==num2);
        System.out.println(num1!=num2);
        //Logical operators:-
        System.out.println("Logical operators:-");
        boolean x=true;
        boolean y=false;
        System.out.println(x&&y);
        System.out.println(x||y);
        sc.close();
       }
   } 
}
