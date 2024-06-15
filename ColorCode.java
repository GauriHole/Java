import java.util.Scanner;

public class ColorCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Color Code (R,O,W,G,Y,B): ");
        char color = sc.next().charAt(0);
        switch (color) {
            case 'R': System.out.println("Red");
                break;
            case 'G': System.out.println("Green");
                break;
            case 'B': System.out.println("Blue");
                break;
            case 'O': System.out.println("Orange");
                break;
            case 'Y': System.out.println("Yellow");
                break;
            case 'W': System.out.println("White");
                break;
            default:  System.out.println("No Colour Found .... ");
                break;
        }
     
    }
}
/*
Enter Color Code (R,O,W,G,Y,B): 
R
Red
 */