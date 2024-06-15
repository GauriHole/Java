import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int num = sc.nextInt();
        int flag=0;

        if(num == 0 || num == 1){
            System.out.println("Number is not Prime");
        }
        else{
        for(int i=2; i<= num/2; i++){

            if(num%i == 0){
                System.out.println("Number is not prime"); 
                flag =1;
                break;
            }  
        }
        if(flag == 0){
            System.out.println("Number is Prime");
        }
    }       
    }   
}
