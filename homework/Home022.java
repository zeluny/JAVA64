package homework;

import java.util.Scanner;

public class Home022 {
    public static void main(String[] args) {
        
        int sum = 0;
        int i = 0;
        Scanner num = new Scanner(System.in);
        
        int numStart = num.nextInt();
        int numEnd = num.nextInt();
        num.close();
        for (i = numStart; i <= numEnd; i++) {
            sum += i;
        }
        System.out.println("Summation is " +sum);
        
    }
}