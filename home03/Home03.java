package home03;



public class Home03 {
    public static void main(String[] args){
        
        int score;
        score = (int)(Math.random()*100);
        System.out.println("Your score is "+score);
        if(score >= 0 && score < 50)
            System.out.println("Grade F");
        else if(score >= 50 && score < 60)
            System.out.println("Grade D");
        else if(score >= 60 && score < 70)
           System.out.println("Grade C");
        else if(score >= 70 && score < 80)
           System.out.println("Grade B");
        else if(score >= 80)
           System.out.println("Grade A");
    }
}
