package home3;

import java.util.Scanner;

public class Test_SubString {
    
    public static void main(String[] args){

        Scanner sn = new Scanner(System.in);
        System.out.print("กรุณาป้อนข้อมูล>>>");
        String data = sn.nextLine();
        int count = data.length();
        for(int i = 0;i < count;i++){
            System.out.print(data.substring(i,(i+1))+ " ");
        }
        for(int i = count; i>0 ;i--){
            System.out.print(data.substring((i-1),i) + " ");
        }
        sn.close();
    }
}
