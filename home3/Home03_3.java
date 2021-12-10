package home3;

import java.util.Scanner;

public class Home03_3 {
    
    public static void main(String[] args){

        Scanner sn = new Scanner(System.in);
        System.out.print("input text>>> ");
        String data = sn.nextLine();
        int count = data.length();
        int sum = 0;
        for(int i = 0; i < count; i++){
            if(data.substring(i,(i+1)).equals("a")||data.substring(i,(i+1)).equals("e")
            ||data.substring(i,(i+1)).equals("i")||data.substring(i,(i+1)).equals("o")
            ||data.substring(i,(i+1)).equals("u")||data.substring(i,(i+1)).equals("A")
            ||data.substring(i,(i+1)).equals("E")||data.substring(i,(i+1)).equals("I")
            ||data.substring(i,(i+1)).equals("O")||data.substring(i,(i+1)).equals("U")){
                sum++;
            }
        }
        System.out.println(data + " มีสระทั้งหมด "+sum+" ตัว");
        sn.close();

        
    }
}
