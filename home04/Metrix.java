package home04;

import java.util.Scanner;

public class Metrix {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int[][]a = new int[3][2];
        int[][]b = new int[3][2];
        int[][]c = new int[3][2];
        int i,j;
        for(i=0;i<3;i++){
            for(j=0;j<2;j++){
                System.out.printf("a[%d,%d] = ",i,j);
                a[i][j] =scan.nextInt();
                System.out.printf("a[%d,%d] = ",i,j);
                b[i][j] =scan.nextInt();
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for(i=0;i<3;i++){
            for(j=0;j<2;j++){
                System.out.printf(c[i][j]+"\t");
            }
            System.out.println();
        }


        scan.close();
    }
}