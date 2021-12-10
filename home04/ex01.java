package home04;

import java.util.*;

public class ex01 {
    public static void main(String[] args){
        
        int[] data = {20,10,30,50,30};
        Arrays.sort(data);
        for(int i = 0; i<data.length;i++){
            System.out.print(data[i]+" ");
        }
    }
}