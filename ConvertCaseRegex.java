import java.util.Scanner;

/* public class ConvertCase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" - - - - - Enter Letter for Convert to Another Case - - - - - -");
        String str = sc.nextLine();
        if(isLowerCase(str)){
            System.out.println(str.toUpperCase());
        }
        else{
            System.out.println(str.toLowerCase());
        }
    }
    public static boolean isLowerCase(String str) {
        for (char ch : str.toCharArray()) {
            if (!Character.isLowerCase(ch)) {
                return false;
            }
        }
        return true;
    } 
} */
    public class ConvertCaseRegex {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" - - - - - Enter Letter for Convert to Another Case - - - - - -");
            String str = sc.nextLine();
            sc.close();
    
            if (str.matches("[a-z]+")) {
                System.out.println(str.toUpperCase());
            } else {
                System.out.println(str.toLowerCase());
            }
        }
    }

/*
PS E:\1_Java> javac ConvertCaseRegex.java 
PS E:\1_Java> java ConvertCaseRegex      
 - - - - - Enter Letter for Convert to Another Case - - - - - -
gauri
GAURI
PS E:\1_Java> javac ConvertCaseRegex.java
PS E:\1_Java> java ConvertCaseRegex
 - - - - - Enter Letter for Convert to Another Case - - - - - -
GAURI
gauri
 */