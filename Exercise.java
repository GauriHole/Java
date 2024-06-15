import java.util.*;
/*
 Accept 2 number from user and perform it's addition (let variables 'num1' and 'num2') ....
 */
public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2: ");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("Sum : "+sum);
    }
}
