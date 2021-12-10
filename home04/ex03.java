package home04;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args){
        
        Scanner sn = new Scanner(System.in);
        double [][]product = new double[3][4];
        int i,j;

        String data="A";
        for(i=0;i<2;i++){
            System.out.println("รับข้อมูลยอดขายของสินค้า "+data);
            for(j = 0; j<3; j++){
                System.out.print("ยอดขายสินค้าของเดือน "+(j+1)+" : ");
                product[i][j] = sn.nextDouble();
                product[i][3] = product[i][3]+product[i][j];
            }
            data="B";
        }
        for(j=0;j<4;j++){
            for(i=0;i<2;i++){
                product[2][j] = product[2][j]+product[i][j];
            }
        }
        
        System.out.println();
        System.out.println("สินค้า\t เดือนที่ 1\t เดือนที่ 2\t เดือนที่ 3\t รวม");
        data = "A";
        for(i=0;i<3;i++){
            System.out.print(data +"\t");
            for(j=0;j<4;j++){
                System.out.print(product[i][j]+"\t");
            }
            if(i == 0)
                data = "B";
            else
                data = "รวม";
            System.out.println();
        }
        sn.close();
    }
}