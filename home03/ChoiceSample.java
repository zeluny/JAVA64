package home03;

import java.util.Scanner;

public class ChoiceSample {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Which provice is in Southern of Thailand");
        System.out.println("1) Chaingmai");
        System.out.println("2) Chonpuri");
        System.out.println("3) Chumphon");
        System.out.print("Your choice to (1, 2, 3) >>>");
        int provice = input.nextInt();
        switch (provice){
            case 1:
                System.out.println("it is incorrect. Chaingmai is in Northern of Thailand");
                break;
            case 2:
                System.out.println("it is incorrect. Chaingmai is in Easthern of Thailand");
                break;
            case 3:
                System.out.println("it is incorrect. Chaingmai is in Southern of Thailand");
                break;
            default:
                System.out.println("Sorry, You can choose only 1,2 and 3");
                break;
        }
        input.close();
    }
}
