package homeCH02;

import java.util.Scanner;

public class HomeCH02 {
    public static void main(String[] args) {
        
        int num, sum = 0;
        Scanner n = new Scanner(System.in);
        n.close();
        for(int i = 1; i<=5;i++){
            System.out.print("ใส่ตัวเลขตัวที่ "+ i + ":");
            num = n.nextInt();
            if(num%2 == 0){
                sum = sum+num;
                System.out.println("ข้อมูลที่เป็นเลขคู่"+ num);
            }
        }
        System.out.println("ผลลัพธ์จากผลบวกของเลขคู่มีค่าเท่ากับ " +sum);
        
    }
}