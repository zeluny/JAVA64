package exp2;

import java.io.*;

public class Exp2 {
    public static void main(String[] args) throws IOException {
        
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(reader);
        System.out.print("Please input any character: ");
        String input = stdin.readLine();
        System.out.println("Your input : "+input);
        
    }
}