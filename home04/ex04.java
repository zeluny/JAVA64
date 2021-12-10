package home04;

import java.util.Scanner;


public class ex04 {
    public static void main(String[] args){
        
        Scanner sn = new Scanner(System.in);
        double [][]salary = new double[4][6];
        String name = "Computer";

        int i,j;
        for(i=0; i<3; i++){
            System.out.println("ป้อนข้อมูลพนักงานแผนก "+ name +" ");
            String name1 = "เงินเดือน";
            for(j=0; j < 2; j++){
                System.out.print(name1 + " : ");
                salary[i][j] = sn.nextDouble();
                if(j == 0)
                    name1 = "ยอดขาย";
            }
            if(i==0)
                name = "Accounting";
            else
                name = "Marketing";
            
        }
        for(i=0;i<3;i++){
            for(j=1;j<2;j++)
                if(salary[i][j]<1000)
                    salary[i][j+1] = 0;
                else if(salary[i][j]<=20000)
                    salary[i][j+1] = salary[i][j]*10/100;
                else if(salary[i][j]<=50000)
                    salary[i][j+1] = salary[i][j]*15/100;
                else if(salary[i][j]<=100000)
                    salary[i][j+1]=salary[i][j]*20/100;
                else 
                    salary[i][j+1]=salary[i][j]*25/100;
                
                salary[i][j+2] = salary[i][j-1]*4/100;

                if(salary[i][j-1]-salary[i][j+2] <= 12000)
                    salary[i][j+3] = 0;
                else if(salary[i][j-1]-salary[i][j+2] <= 20000)
                    salary[i][j+3] = (salary[i][j-1]-salary[i][j+2])*10/100;
                else 
                    salary[i][j+3] = (salary[i][j-1]-salary[i][j+2])*15/100;
                
                
                salary[i][j+4] = salary[i][j-1]+salary[i][j+1] - salary[i][j+2] - salary[i][j+3];
        }
        for(j = 0;j<6;j++){
            for(i = 0;i< 3;i++){
                salary[3][j] = salary[3][j] + salary[i][j];
            }
        }
        
        System.out.println("แผนก \t เงินเดือน \t ยอดขาย \t ค่าคอมมิชชั่น \t ค่าประกันสังคม \t ค่าภาษี \t รายได้สุทธิ");
        name = "Computer";
        for(i = 0; i<4; i++){
            System.out.print(name+"\t");
            for(j = 0;j<6;j++){
                System.out.print(salary[i][j]+"\t");
            }
        }
        if(i == 0)
            name = "Accounting";
        else if(i == 1)
            name = "Marketing";
        else 
            name = "จำนวนเงินรวม";




        sn.close();
    }
}