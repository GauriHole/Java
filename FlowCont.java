/*
1.1 Check number is Positive , Negative or Zero.
1.2 Take 2 number as input check wheather their last digit is same 
If yes return True another false.   
*/

import java.util.Scanner;

public class FlowCont {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1>0 && num2>0){
            System.out.println("Numbers are Positive ");
            int fno=num1%10;
            int lno=num2%10;
            if(fno==lno){
                System.out.println("-------TRUE------");
            }
            else{
                System.out.println("-------FALSE------"); 
            }
        }
        else if(num1<0 && num2>0){
            System.out.println("Number 1 is  Negative and Number 2 is Positive");
        }
        else if(num1>0 && num2<0){
            System.out.println("Number 2 is  Negative and Number 1 is Positive");
        }
        else if(num1<0 && num2<0){
            System.out.println("Number 2 and Number 1 are  Negative ");
        }
        else{
            System.out.println("Number is Zero");
        }
    }
}
/* 
* * * Output 1.1 * * *
PS E:\1_Java> javac FlowCont.java
PS E:\1_Java> java FlowCont
Enter A Number : 
1
Number is Positive
PS E:\1_Java> javac FlowCont.java
PS E:\1_Java> java FlowCont       
Enter A Number : 
0
Number is Zero
PS E:\1_Java> javac FlowCont.java
PS E:\1_Java> java FlowCont
Enter A Number : 
-7
Number is Negative

* * * Output 1.2 * * *
PS E:\1_Java> javac FlowCont.java
PS E:\1_Java> java FlowCont       
Enter Two Numbers : 
12 20
Numbers are Positive
-------FALSE------
PS E:\1_Java> javac FlowCont.java
PS E:\1_Java> java FlowCont       
Enter Two Numbers : 
12 22
Numbers are Positive
-------TRUE------
PS E:\1_Java> javac FlowCont.java
PS E:\1_Java> java FlowCont
Enter Two Numbers : 
12 -13
Number 2 is  Negative and Number 1 is Positive
PS E:\1_Java> javac FlowCont.java
PS E:\1_Java> java FlowCont
Enter Two Numbers : 
-10 12
Number 1 is  Negative and Number 2 is Positive
PS E:\1_Java> javac FlowCont.java
PS E:\1_Java> java FlowCont
Enter Two Numbers :
-12 -2
Number 2 and Number 1 are  Negative
 */