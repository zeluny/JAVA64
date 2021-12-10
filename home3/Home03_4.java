package home3;
import java.util.Scanner;
public class Home03_4 {
    public static void main(String[] args) { 
        Scanner sn = new Scanner(System.in);
        System.out.print("กรุณาป้อนคำศัพท์ภาษาอังกฤษ >>> ");
        String data = sn.nextLine();
        int count = data.length();
        

        if(data.substring(count-1,count).equals("e"))
        System.out.println(data+"s");

        
        else if(data.substring(count-1,count).equals("s")||data.substring(count-1,count).equals("x")||
        data.substring(count-1,count).equals("z")||data.substring(count-2,count).equals("ss")||
        data.substring(count-2,count).equals("sh")||data.substring(count-2,count).equals("ch"))
        System.out.println(data+"es");

        
        else if(data.substring(count-1,count).equals("y"))
        
        if(data.substring(count-2,count-1).equals("a")||data.substring(count-2,count-1).equals("e")||
        data.substring(count-2,count-1).equals("i")||data.substring(count-2,count-1).equals("o")||
        data.substring(count-2,count-1).equals("u"))
        System.out.println(data+"s");
        else
        System.out.println(data.substring(0,count-1)+"ies");
        else
        System.out.println(data+"s"); 
        sn.close();
    }
}
