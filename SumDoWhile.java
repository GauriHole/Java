import java.util.*;
class SumDoWhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n' for Sum : ");
        int n = sc.nextInt();
        int sum=0;
        int i=1;
        do{
            sum =  sum + i;
            i++;
        }while(i<=n);
        System.out.println("Sum of 'n' Natural numbers are : "+sum);
    }
}