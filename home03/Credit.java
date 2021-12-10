package home03;

import java.util.Scanner;

public class Credit {
        
    public static void main(String[] args){
            Scanner sn = new Scanner(System.in);
            double salary;
            System.out.println("กรุณาใส่ข้อมูลเงินเดือน >>> ");
            salary = sn.nextDouble();
            System.out.println("Credit Card Application Team Agreement");
            System.out.println("Your salary is %.2f\n"+salary);
            if(salary >= 5000){
                if(salary <= 20000)
                    System.out.println("You are Sliver Member");
                else if(salary < 30000)
                    System.out.println("You are Gold Member");
                else
                    System.out.println("You are Platinum Member");
            }else{
                System.out.println("You cannot apply for our credit card");
            }
            sn.close();   
        }
        
    
}
