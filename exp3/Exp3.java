package exp3;

import java.io.*;

public class Exp3 {
    public static void main(String[] args) throws IOException {
        
        InputStreamReader num = new InputStreamReader(System.in);
        BufferedReader buffer1 = new BufferedReader(num);
        String one, two, three, four;
        int number1, number2;
        double number3, number4, sum;
        System.out.print("Enter number 1: ");
        one = buffer1.readLine();
        System.out.print("Enter number 2: ");
        two = buffer1.readLine();
        System.out.print("Enter number 3: ");
        three = buffer1.readLine();
        System.out.print("Enter number 4: ");
        four = buffer1.readLine();
        number1 = Integer.parseInt(one);
        number2 = Integer.parseInt(two);
        number3 = Integer.parseInt(three);
        number4 = Integer.parseInt(four);
        sum = number1 + number2 + number3 + number4;
        System.out.println("ผลรวมของเลขทั้งที่จำนวนคือ "+sum);
        
    }
}