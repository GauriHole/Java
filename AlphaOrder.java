import java.util.Arrays;
import java.util.Arrays.*;
public class AlphaOrder {
 public static void main(String[] args) {
    char fchar = 's';
    char schar = 'g';
    char array[] ={fchar,schar};
    Arrays.sort(array);
    System.out.println(new String(array) +" ");
 }   
}
/* 
PS E:\1_Java> javac AlphaOrder.java
PS E:\1_Java> java AlphaOrder
g s */

