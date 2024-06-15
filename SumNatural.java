import java.util.*;
class SumNatural{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'n' for Sum : ");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum =  sum + i;
        }
        System.out.println("Sum of 'n' Natural numbers are : "+sum);
    }
}