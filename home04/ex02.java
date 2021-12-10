package home04;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        
        Scanner sn = new Scanner(System.in);
        System.out.print("จองเนื้อที่อาร์เรย์ 1 มิติ ==> ");
        int n = sn.nextInt();
        int[] data = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("รับอาร์เรย์ตัวที่ "+ (i+1)+":");
            data[i] = sn.nextInt();
        }

        System.out.println("ข้อมูลเลขจำนวนเต็มที่เป็นลำดับย้อนกลับ");
        for(int i = n-1; i >= 0; i-- ){
            System.out.print(data[i]+" ");
        }
        sn.close();
    }
}