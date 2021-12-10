package home03;


public class WhileSample {
    public static void main(String[] args){
        
        
        int number = (int)(Math.random()*100);
        number = number%13;
        System.out.println("Number = "+number);
        int cnt = 1;
        while(cnt <= 12){
            System.out.println(number +"x"+cnt+"="+(number*cnt));
            cnt++;
        }
        System.out.println("for Sample");
        for(int i=1; i<=12; i++){
            System.out.println(number +"x"+i+"="+(number*i));
        }
    }
}
