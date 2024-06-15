import java.util.Scanner;

public class PercIntrest {
    public static void main(String[] args) {
        String gender = args[0];
        int age = Integer.parseInt(args[1]);
        String Female ="Female";
        String Male ="Male";
        if(gender.equals(Female) && (age>=1 && age<=58)){
            System.out.println("Interest is 8.2%");
        }
        else if(gender.equals(Female) && (age>=59 && age<=100)){
            System.out.println("Interest is 9.2%");
        }
        else if(gender.equals(Male) && (age>=1 && age<=58)){
            System.out.println("Interest is 8.4%");
        }
        else if(gender.equals(Male) && (age>=59 && age<=100)){
            System.out.println("Interest is 10.5%");
        }
        else{
            System.out.println("0% Interest");
        }
    }
}
/* 
PS E:\1_Java> javac PercIntrest.java
PS E:\1_Java> java PercIntrest Female 5
Interest is 8.2%
0% Interest
PS E:\1_Java> java PercIntrest Female 95   
Interest is 9.2%
0% Interest
PS E:\1_Java> javac PercIntrest.java     
PS E:\1_Java> java PercIntrest Female 5
Interest is 8.2%
PS E:\1_Java> java PercIntrest Female 95
Interest is 9.2%
PS E:\1_Java> java PercIntrest Male 55  
Interest is 8.4%
PS E:\1_Java> java PercIntrest Male 98 
Interest is 10.5%
PS E:\1_Java> java PercIntrest Male 0 
0% Interest
*/