package review;

import java.util.Scanner;

public class revieww {
    public static void main(String[] args) {
        
       Scanner sn = new Scanner (System.in);
       int i , j , n ;
       int price = 69900 ;
       System.out.println("บริษัท เอแอนด์บีท่องเที่ยว จำกัด");
       //1.รับจำนวนสมาชิกผ่านทางคีย์บอรฺ์ด
       System.out.print("กรุณาใส่จำนวนสมาชิกในการจองทัวร์ประเทศนิวซีแลนด์ : ");
       n = sn.nextInt();
       int [][] tour = new int[n][6] ;
       //2.รับข้อมูล รหัสสมาชิก อายุ และคะแนนสะสม
       for(i=0 ; i<n ; i++){
           System.out.println("สมาชิกรายที่ "+(i+1));
           String mem = "รหัสสมาชิก" ;
           for(j=0 ; j<3 ; j++){
               System.out.print(mem+ " : ");
               tour[i][j] = sn.nextInt();
               if(j==0)
                   mem = "อายุของสมาชิก" ;
               else
                   mem = "คะแนนสะสม";
          }
       }
       sn.close();
    }
