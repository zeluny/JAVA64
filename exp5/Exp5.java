package exp5;

import java.util.Scanner;

public class Exp5 {
    public static void main(String[] args) {
        
        String name;
        int qty;
        double price;
        Scanner sn = new Scanner(System.in);
        sn.close();
        System.out.print("ป้อนข้อมูลชื่อสินค้า>>> ");
        name = sn.nextLine();
        System.out.print("ป้อนข้อมูลราคาสินค้าต่อหน่วย (บาท)>>> ");
        qty = sn.nextInt();
        System.out.print("ป้อนข้อมูลราคาสินค้าต่อหน่วย (บาท)>>> ");
        price = sn.nextDouble();
        System.out.printf("%s %d หน่วย", name,qty);
        System.out.printf("หน่วยละ %.2f บาท\n", price);
        System.out.printf("รวมเป็น %.2f บาท\n",qty * price);
        System.out.printf("ภาษี 7%% เป็นเงินสุทธิ %.2f บาท",1.07f*(qty*price));
    }
}