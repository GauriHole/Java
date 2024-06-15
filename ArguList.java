public class ArguList {
    public static void main(String[] args) {
    
        String arglist[]= new String[args.length];        
        if(args.length!=0){
            for(int i=0;i<args.length;i++) { 
                arglist[i]=args[i];
                System.out.println("Argument "+i+": "+arglist[i]);
            }
        }
    
        else{
            System.out.println("No values Present");
        }
    }
}

/* PS E:\1_Java> javac ArguList.java
PS E:\1_Java> java ArguList
No values Present

PS E:\1_Java> javac ArguList.java
PS E:\1_Java> java ArguList A B C D E
Argument0: A
Argument1: B
Argument2: C
Argument3: D
Argument4: E */