package home3;

import java.util.Scanner;

public class ToString {
    
    public static void main(String[] args){

        Scanner sn = new Scanner(System.in);
        System.out.print("กรุณาป้อนหมายเลขโทรศัพท์์>>>");
        long tel = sn.nextLong();
        String S_tel = Long.toString(tel);
        if(S_tel.substring(0,1).equals("9")){
            System.out.print(tel+"หมายเลขโทรศัพท์ขึ้นต้นด้วยเลข 9");
        }else{
            System.out.print(tel+"หมายเลขโทรศัพท์ไม่ได้ขึ้นต้นด้วยเลข 9");
        }

        sn.close();
    }
}
