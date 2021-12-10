package homework03;


public class hw32 {
    public static void main(String[] args) {
        
        int c = 0;
        int i = 0;
        for(int count = 2; count < 27;) {
            for( c = 2; c <= i - 1; c++){
                if( i%c == 0){
                    break;
                }
            }if ( c == i ){
                System.out.println(""+i);
                count++;
            }i++;
        }
    }
}