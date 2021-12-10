package home03;

import java.util.Scanner;

public class GradeCal {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        int score;
        System.out.print("ป้อนค่าคะแนนนักศึกษา >>>");
        score = sn.nextInt();
        if(score > 49){
            System.out.println("Your score is " +score);
            System.out.println("You passed the exam.");
        }else{
            System.out.println("Sorry you failed");
            System.out.println("Your score ("+score+") is less than 50");
        }
        sn.close();
    }
}