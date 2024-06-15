import java.util.Scanner;

public class MonthCode {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        String array[] ={"","January","February","March","April","May","June","July","August","September","Octomber","November","December"};
        for(int i=1;i<=12;i++){
            if(month == i){
                System.out.println(array[i]);
            }
        }
    }
}
/*
PS E:\1_Java> javac MonthCode.java
PS E:\1_Java> java MonthCode 9
September
PS E:\1_Java> javac MonthCode.java
PS E:\1_Java> java MonthCode 11
November
 */