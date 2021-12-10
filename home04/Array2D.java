package home04;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args){
        
        Scanner sn = new Scanner(System.in);
        int[][]num_std = new int[2][4];
        int []tfac = new int[2];
        int i, j, total = 0;

        for(i = 0; i < 2; i++){
            System.out.println("Enter total student in faculty "+ (i + 1));
            for(j=0; j < 4; j++){
                System.out.print("year "+( j+1 )+" = ");
                num_std[i][j] = sn.nextInt();
                tfac[i]=tfac[i]+num_std[i][j];
            }
            total += total;
        }

        for(i=0; i < 2; i++){
            System.out.println("========================");
            for(j=0; j<4; j++){
                System.out.println("student in year "+ (j+1)+"="+num_std[i][j]);
            }
            System.out.println("student in faculty = "+tfac[i]);
        }
        System.out.println("total students = "+total);
        sn.close();
    }
}