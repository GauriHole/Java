import java.util.Scanner;

public class MiniProject1 {
    public static void main(String[] args) {
        int eid[] = {1001,1002,1003,1004,1005,1006,1007};
        String ename[] = {"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
        String dept[] = {"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
        long basic[] = {20000,30000,10000,12000,50000,23000,29000};
        long hra[] = {8000,12000,8000,6000,20000,9000,12000};
        long it[] = {3000,9000,1000,2000,20000,4400,10000};
        String desgcode[] = {"e","c","k","r","m","e","c"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee id : ");
        int ipemp = sc.nextInt();

        boolean empFound = false;
        long da, salary;
        for (int i = 0; i < eid.length; i++) {
            if (ipemp == eid[i]) {
                empFound = true;
                System.out.println("EmpNO   EmpName   Department   Designation  Salary");
                System.out.print(eid[i] + "\t" + ename[i] + "\t  " + dept[i] + "\t");
                String design = desgcode[i];
                switch (design) {
                    case "e":
                        da = 20000;
                        salary = (basic[i] + hra[i] + da) - it[i];
                        System.out.println("\tEngineer    " + salary);
                        break;
                    case "c":
                        da = 32000;
                        salary = (basic[i] + hra[i] + da) - it[i];
                        System.out.println("  Consultant\t" + salary);
                        break;
                    case "k":
                        da = 12000;
                        salary = (basic[i] + hra[i] + da) - it[i];
                        System.out.println("  Clerk\t" + salary);
                        break;
                    case "r":
                        da = 15000;
                        salary = (basic[i] + hra[i] + da) - it[i];
                        System.out.println("  Receptionist\t" + salary);
                        break;
                    case "m":
                        da = 40000;
                        salary = (basic[i] + hra[i] + da) - it[i];
                        System.out.println("  Manager\t" + salary);
                        break;
                }
                break;
            }
        }
        if (!empFound) {
            System.out.println("There is no employee with empid: " + ipemp);
        }
    }
}
