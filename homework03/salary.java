package homework03;

import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String con = "";
        String word[] = {"y","Y"};
        do {
            int salary = 0;
            int ot = 0;
            
            System.out.println("Enter code, name and hours:");
            String code = scanner.nextLine();
            String name = scanner.nextLine();
            int hours = scanner.nextInt();

            if( hours <= 10 ) {
                salary = hours * 100;
            }else if( hours <= 20 ) {
                ot = hours - 10;
                salary = ( ot * 200 ) + 1000;
            }else if( hours > 20 ) {
                ot = hours - 10;
                salary = ( ot * 300 ) + 1000;
            }
            System.out.println("Code : "+code);
            System.out.println("Name : "+name);
            System.out.println("Salary is : "+salary);
            System.out.println("Continue Y or y: ");
            con = scanner.nextLine();

        } 
        while ( con.equals(word));
        scanner.close();
    }
}