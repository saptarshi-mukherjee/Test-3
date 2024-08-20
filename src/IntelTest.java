import java.util.*;

public class IntelTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1, num2, sum, diff=0;
        System.out.println("Enter first number :-");
        num1=sc.nextInt();
        System.out.println("Enter second number :-");
        num2=sc.nextInt();
        sum=num1+num2;
        System.out.println("Sum is = "+sum);
        diff=Math.abs(num1-num2);
        System.out.println("Absolute difference = "+diff);
    }
}
