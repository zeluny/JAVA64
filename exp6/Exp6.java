package exp6;

import javax.swing.JOptionPane;

public class Exp6 {
    public static void main(String[] args) {
        
        String firstNum, secondNum;
        int num1, num2, sum;
        firstNum = JOptionPane.showInputDialog("Enter first integer");
        secondNum = JOptionPane.showInputDialog("Enter second integer");
        num1 = Integer.parseInt(firstNum);
        num2 = Integer.parseInt(secondNum);
        sum = num1 + num2;
        JOptionPane.showMessageDialog(null,"The sum is "+sum,"Result",JOptionPane.INFORMATION_MESSAGE);
    }
}