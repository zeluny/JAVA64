package finala;

import java.util.Scanner;

public class F4inal {
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);

        String data;

        System.out.print("Input String => ");
        data = sn.nextLine();

        int count = data.length();
        for(int i = 0; i < count; i++){
            if(data.substring(i,(i+1)).equals(data.length()/3)){
                continue;
            }
            System.out.print("data %c", data);
        
        }
        sn.close();
    }
  }
