import java.util.Scanner;

public class FoundCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Character : ");
        char character = sc.next().charAt(0);
        if((character >= '0')&&(character <='9')){
            System.out.println("Giver Character is Number");
        }
        else if((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')){
            System.out.println("Given Charcter is Alphabet ");
        }
        else{
            System.out.println("Given Character is Symbols ");
        }
    sc.close();
    }
}

/* 
 PS E:\1_Java> javac FoundCharacter.java
PS E:\1_Java> java FoundCharacter
Enter Your Character : 
Gauri
Given Charcter is Alphabet
PS E:\1_Java> javac FoundCharacter.java
PS E:\1_Java> java FoundCharacter
Enter Your Character : 
100
Giver Character is Number
PS E:\1_Java> javac FoundCharacter.java
PS E:\1_Java> java FoundCharacter
Enter Your Character :
@#
Given Character is Symbols
 */