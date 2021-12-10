package home3;

import java.util.Scanner;

public class SubString {
    
    public static void main(String[] args){

        Scanner sn = new Scanner(System.in);
        System.out.print("กรุณาป้อนข้อมูล>>>");
        String name = sn.nextLine();
        System.out.println(name+"มีทั้งหมด"+name.length()+"ตัวอักษร");
        System.out.println(name+"ดึงตัวอักษรสามตัวแรก"+name.substring(0,3));
        System.out.println(name+"ดึงตัวอักษรสามตัวสุดท้าย"+name.substring(name.length()-3,name.length()));
        int count = name.length();
        System.out.println(name+"ดึงตัวอักษรสามตัวสุดท้าย"+name.substring(count-3,count));
        sn.close();
    }
}
