import java.util.*;
public class ExeciseCal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        float no1 = sc.nextFloat();
        System.out.println("Enter Second Number : ");
        float no2 = sc.nextFloat();
        System.out.println("\t + \t - \t * \t % \n Enter which operation you would like to perform : ");
        char op = sc.next().charAt(0); 
        switch(op){
            case '+' : System.out.println("Addition is : "+(no1+no2));
            break;
            case '-' : System.out.println("Substraction is : "+(no1-no2));
            break;
            case '*' : System.out.println("Multiplication is : "+(no1*no2));
            break;
            case '%' : System.out.println("Modulus is : "+(no1%no2));
            break;
            default: System.out.println("Invalid Operation");
        }
    }
}
