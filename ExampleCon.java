import java.util.Scanner;
public class ExampleCon {
    public static void main(String[] args) {
        System.out.println("Program for Converting Decimal to Binary ....");
        System.out.println("Enter Number : ");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int biNum[] = new int[32];
        int i = 0;
        while (n > 0) {
            biNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i-1; j >= 0; j--)
            System.out.print(biNum[j]);
    }
}
/* 
PS E:\1_Java> javac ExampleCon.java
PS E:\1_Java> java ExampleCon       
Program for Converting Decimal to Binary ....
Enter Number : 
10
1010
 */