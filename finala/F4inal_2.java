package finala;

import java.util.Scanner;

public class F4inal_2 {
    public static void main(String[] args) {
       Scanner sn = new Scanner (System.in);
       int i , j , n ;
       int price = 69900 ;
       System.out.println("บริษัท เอแอนด์บีท่องเที่ยว จำกัด");
       //1.รับจำนวนสมาชิกผ่านทางคีย์บอรฺ์ด
       System.out.print("Candidate number : ");
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
                   mem = "เขต 1" ;
                else if(j==1)
                   mem = "เขต 2";
                else if(j==2)
                   mem = "เขต 3";
                else
                   mem = "เขต 4";
          }
       }
       /*3.คำนวณราคาทัวร์ อายุเกิน 15 ปี ราคาทัวร์ 89900 บาท
                                  ถ้าไม่เกิน 15 ปี ราคาทัวร์ 69900 บาท
         เงื่อนไข อายุ 5-7  ปี     ได้ส่วนลด 15 % 
                     อายุ 8-11 ปี    ได้ส่วนลด 12 %
                     อายุ 12-14 ปี  ได้ส่วนลด 10 %
                     อายุ 15 ปี      ได้ส่วนลด  5 %  */
       for(i=0 ; i<n ; i++){
           for(j=1 ; j<=1 ; j++){
               if(tour[i][j]>15)
                   tour[i][3] = 89900;
               else if(tour[i][j]==15)
                   tour[i][3] = price - (price * 5/100);
               else if(tour[i][j] >= 12 && tour[i][j] <= 14 )
                    tour[i][3] = price - (price * 10/100);
               else if(tour[i][j] >= 8 && tour[i][j] <= 11 )
                    tour[i][3] = price - (price * 12/100);
               else if(tour[i][j] >= 5 && tour[i][j] <= 7 )
                    tour[i][3] = price - (price * 15/100);
               else 
                    tour[i][3] = 0;   
           }           
       }
        /*ถ้าสมาชิกมีอายุไม่เกิน 15 ปี และรหัสสมาชิกขึ้นต้นด้วยเลข 1 ได้ส่วนลดค่าทัวร์ 15 %
        ถ้ารหัสสมาชิกขึ้น ต้นด้วยเลข 2 ได้ส่วนลดค่าทัวร์ 12 %
        ถ้ารหัสสมาชิกขึ้น ต้นด้วยเลข 3 ได้ส่วนลดค่าทัวร์ 10 %
        พร้อมทั้งเปรียบเทียบส่วนลดที่ได้รับระหว่างอายุและรหัสสมาชิก */
       int reprice ;
       for(i=0 ; i<n ; i++){
           for(j=0 ; j<=0 ; j++){
               if(tour[i][1]<=15)
                    price = 69900;
                    if(tour[i][j]>=100 && tour[i][j]<=199)
                       reprice = price- (price * 15/100);
                    else if(tour[i][j]>=200 && tour[i][j]<=299)
                       reprice = price- (price * 12/100);
                    else if(tour[i][j]>=300 && tour[i][j]<=399)
                       reprice = price- (price * 10/100);
                    else
                       reprice = price;
               
               if(reprice < tour[i][3])
                   tour[i][3] = reprice;       
           }
       }
       
       /*ถ้าสมาชิกมีอายุเกิน 15 ปี และรหัสสมาชิกขึ้นต้นด้วยเลข 1 ได้ส่วนลดค่าทัวร์ 15 %
        ถ้ารหัสสมาชิกขึ้น ต้นด้วยเลข 2 ได้ส่วนลดค่าทัวร์ 12 %
        ถ้ารหัสสมาชิกขึ้น ต้นด้วยเลข 3 ได้ส่วนลดค่าทัวร์ 10 % */
       for(i=0 ; i<n ; i++){
           for(j=0 ; j<=0 ; j++){  
              
               if(tour[i][1]>15){
                  price = 89900;
                    if(tour[i][j]>=100 && tour[i][j]<=199)
                       tour[i][3] = price- (price * 15/100);
                    else if(tour[i][j]>=200 && tour[i][j]<=299)
                       tour[i][3] = price- (price * 12/100);
                    else if(tour[i][j]>=300 && tour[i][j]<=399)
                       tour[i][3] = price- (price * 10/100);
                    else
                       tour[i][3] = price;
               }     } }
       //คะแนนสะสมพร้อมตัดยอดแลกคูปองเงินสด
       for(i=0 ; i<n ; i++){
           tour[i][2] += (tour[i][3]/1000)*10;
           //คะแนนสะสม
           for(j=2 ; j<=2 ; j++){
               if(tour[i][j]>=1000){
                   tour[i][4] = 2500;
                   tour[i][2] =tour[i][2]-1000;}
               else if(tour[i][j]>=800){
                   tour[i][4] = 2000;
                   tour[i][2] =tour[i][2]-800;}
               else if(tour[i][j]>=500){
                   tour[i][4] = 1500;
                   tour[i][2] =tour[i][2]-500;}
               else if(tour[i][j]>=300){
                   tour[i][4] = 1000;
                   tour[i][2] =tour[i][2]-300;}
               else{
                   tour[i][2] = tour[i][2];}
   //คำนวณหาราคาจ่ายจริง คิดจาก ราคาทัวร์ - คูปองเงินสด
   tour[i][5] = tour[i][3] - tour[i][4];
               }
           }
       //คำนวณยอดรวมราคาทัวร์ คูปองเงินสด ราคาจ่ายจริง คำนวณแนวตั้ง
       int [] total = new int[3] ;
       for(j=3 ; j<6 ; j++){
           for(i=0 ; i<n ; i++){
               total[j-3] += tour[i][j];
           }
       }
             //นับอายุนักท่องเที่ยว
       int num = 0 , num1 = 0;
       for(i=0 ; i<n ; i++){
           if(tour[i][1]<=15)
               num++;
           else 
               num1++;
       }
       //แสดงผลทางหน้าจอ
       System.out.println("รหัสสมาชิก อายุ คะแนนสะสม ราคาทัวร์ คูปองเงินสด ราคาจ่ายจริง");
       for(i=0 ; i<n ; i++){
           for(j=0 ; j<6 ; j++){
               System.out.print(tour [i][j] +"\t");
           }
           System.out.println();
       }
 
       System.out.println("     รวมจำนวนเงิน\t"+total[0]+"\t"+total[1]+"\t"+total[2]);
       System.out.println("จำนวนนักท่องเที่ยวที่มีอายุไม่เกิน 15 ปี มี "+num+" ท่าน");
       System.out.println("จำนวนนักท่องเที่ยวที่มีอายุเกิน 15 ปี มี "+num+" ท่าน"); 

       System.out.println("ผู้สมัครได้รับเลือกตั้งคะแนนสูงสุดคือ "+num+" ท่าน");
       System.out.println("ผู้สมัครได้รับเลือกตั้งคะแนนต่ำสุดคือ "+num+" ท่าน");

       sn.close();
  }
}

