package exp4;

import java.util.Scanner;

public class Exp4 {
    public static void main(String[] args) {
        
        int x, y;
        Scanner in = new Scanner(System.in);
        in.close();
        System.out.println("input number 1 : ");
        x = in.nextInt();
        System.out.println("input number 2 : ");
        y = in.nextInt();
        System.out.println(x+"+" + y+"="+(x+y)); 
    }
}