package homework;

import java.util.Scanner;

public class Home021 {
    public static void main(String[] args) {
        
        int sum = 0;
        int i = 0;
        int price;
        int per;
        int total;
        int change;
        Scanner num = new Scanner(System.in);
        int again = num.nextInt();
        while(again != 0){
            
            int student = num.nextInt();
            int hour = num.nextInt();
            
            if(student == 1){
                price = hour * 500;
            }else if(student == 2){
                price = hour * 450 * 2;
            }else if(student == 3){
                price = hour * 400 * 3;
            }else if(student == 4){
                price = hour * 350 * 4;
            }else if(student == 5){
                price = hour * 300 * 5;
            }

            per = price / student;

            
            System.out.println("Price/person is " +per);
            System.out.println("Total is " +price);
            System.out.println("Pay is ");
            int pay = num.nextInt();
            System.out.println("Pay is " +pay);
            change = pay - price;
            System.out.println("Change is " +change);
            int again = num.nextInt();
            
        }
        num.close();
    }
}